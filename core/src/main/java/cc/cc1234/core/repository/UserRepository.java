package cc.cc1234.core.repository;

import cc.cc1234.core.domain.User;
import cc.cc1234.core.domain.UserPurchasedGoods;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    /**
     * @param page
     * @param size
     * @return records
     */
    List<User> list(Long page, Long size);

    Optional<User> selectByPrimaryKey(Long id);

    /**
     * @param user
     * @return primary key
     */
    Long insertAndReturnPrimaryKey(User user);

    boolean deleteByPrimaryKey(Long id);

    boolean updateByPrimaryKey(User user);

    List<UserPurchasedGoods> selectUserPurchasedOrders(Long userId);
}
