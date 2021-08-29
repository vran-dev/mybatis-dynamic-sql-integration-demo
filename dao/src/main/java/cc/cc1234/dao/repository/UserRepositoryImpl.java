package cc.cc1234.dao.repository;

import cc.cc1234.core.domain.User;
import cc.cc1234.core.domain.UserPurchasedGoods;
import cc.cc1234.core.repository.UserRepository;
import cc.cc1234.dao.converter.UserRecordConverter;
import cc.cc1234.dao.mapper.OrderEntityDynamicSqlSupport;
import cc.cc1234.dao.mapper.OrderItemEntityDynamicSqlSupport;
import cc.cc1234.dao.mapper.UserEntityDynamicSqlSupport;
import cc.cc1234.dao.mapper.UserEntityMapper;
import cc.cc1234.dao.model.UserEntity;
import lombok.val;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Autowired
    private UserRecordConverter userRecordConverter;

    @Override
    public List<User> list(Long page, Long size) {
        long current = page;
        if (page < 1) {
            current = 1L;
        }
        Long offset = (current - 1) * size;
        return userEntityMapper.select(c -> c.limit(size).offset(offset))
                .stream()
                .map(record -> userRecordConverter.to(record))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> selectByPrimaryKey(Long id) {
        return userEntityMapper.selectByPrimaryKey(id)
                .map(userRecordConverter::to);
    }

    @Override
    public Long insertAndReturnPrimaryKey(User user) {
        final UserEntity entity = userRecordConverter.from(user);
        userEntityMapper.insertSelective(entity);
        System.out.println("insert result = " + entity.getId());
        return entity.getId();
    }

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        int delete = userEntityMapper.delete(d -> d.where(UserEntityDynamicSqlSupport.id, isEqualTo(id)));
        return delete == 1;
    }

    @Override
    public boolean updateByPrimaryKey(User userEntity) {
        var record = userRecordConverter.from(userEntity);
        return userEntityMapper.updateByPrimaryKeySelective(record) == 1;
    }

    /**
     * <pre>
     *     select user.id, order_item.goods_name, sum(order_item.goods_quantity) from user
     *      inner join `order` on user.id = `order`.user_id
     *      inner join order_item on `order`.id = order_item.order_id
     *      where user.id = 1 group by order_item.goods_name
     * </pre>
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserPurchasedGoods> selectUserPurchasedOrders(Long userId) {

        // alias
        val user = UserEntityDynamicSqlSupport.userEntity;
        val orderItem = OrderItemEntityDynamicSqlSupport.orderItemEntity;
        val order = OrderEntityDynamicSqlSupport.orderEntity;

        // build sql dsl
        val sqlDsl = select(user.id, orderItem.goodsName, sum(orderItem.goodsQuantity).as("goods_quantity"))
                .from(user)
                .join(order).on(user.id, equalTo(order.userId))
                .join(orderItem).on(order.id, equalTo(orderItem.orderId))
                .where(user.id, isEqualTo(userId))
                .groupBy(orderItem.goodsName)
                .build()
                .render(RenderingStrategies.MYBATIS3);

        // execute and map
        return userEntityMapper.selectMany(sqlDsl, map -> {
            val result = new UserPurchasedGoods();
            result.setGoodsQuantity(Integer.parseInt(map.get("goods_quantity").toString()));
            result.setGoodsName(map.get("goods_name").toString());
            return result;
        });
    }
}
