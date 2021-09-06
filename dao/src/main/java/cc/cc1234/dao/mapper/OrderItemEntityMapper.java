package cc.cc1234.dao.mapper;

import static cc.cc1234.dao.mapper.OrderItemEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cc.cc1234.dao.model.OrderItemEntity;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface OrderItemEntityMapper extends CommonSelectMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderNo, orderId, goodsName, goodsQuantity, goodsPrice, createAt, updateAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<OrderItemEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @Insert({
        "${insertStatement}"
    })
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<OrderItemEntity> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int insertMultiple(MultiRowInsertStatementProvider<OrderItemEntity> multipleInsertStatement) {
        return insertMultiple(multipleInsertStatement.getInsertStatement(), multipleInsertStatement.getRecords());
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderItemEntityResult")
    Optional<OrderItemEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderItemEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_quantity", property="goodsQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price", property="goodsPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderItemEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int insert(OrderItemEntity record) {
        return MyBatis3Utils.insert(this::insert, record, orderItemEntity, c ->
            c.map(orderNo).toProperty("orderNo")
            .map(orderId).toProperty("orderId")
            .map(goodsName).toProperty("goodsName")
            .map(goodsQuantity).toProperty("goodsQuantity")
            .map(goodsPrice).toProperty("goodsPrice")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int insertMultiple(Collection<OrderItemEntity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, orderItemEntity, c ->
            c.map(orderNo).toProperty("orderNo")
            .map(orderId).toProperty("orderId")
            .map(goodsName).toProperty("goodsName")
            .map(goodsQuantity).toProperty("goodsQuantity")
            .map(goodsPrice).toProperty("goodsPrice")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int insertSelective(OrderItemEntity record) {
        return MyBatis3Utils.insert(this::insert, record, orderItemEntity, c ->
            c.map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(goodsQuantity).toPropertyWhenPresent("goodsQuantity", record::getGoodsQuantity)
            .map(goodsPrice).toPropertyWhenPresent("goodsPrice", record::getGoodsPrice)
            .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
            .map(updateAt).toPropertyWhenPresent("updateAt", record::getUpdateAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default Optional<OrderItemEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default List<OrderItemEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default List<OrderItemEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default Optional<OrderItemEntity> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderItemEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderItemEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderNo).equalTo(record::getOrderNo)
                .set(orderId).equalTo(record::getOrderId)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(goodsQuantity).equalTo(record::getGoodsQuantity)
                .set(goodsPrice).equalTo(record::getGoodsPrice)
                .set(createAt).equalTo(record::getCreateAt)
                .set(updateAt).equalTo(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderItemEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(goodsQuantity).equalToWhenPresent(record::getGoodsQuantity)
                .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(updateAt).equalToWhenPresent(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int updateByPrimaryKey(OrderItemEntity record) {
        return update(c ->
            c.set(orderNo).equalTo(record::getOrderNo)
            .set(orderId).equalTo(record::getOrderId)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(goodsQuantity).equalTo(record::getGoodsQuantity)
            .set(goodsPrice).equalTo(record::getGoodsPrice)
            .set(createAt).equalTo(record::getCreateAt)
            .set(updateAt).equalTo(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    default int updateByPrimaryKeySelective(OrderItemEntity record) {
        return update(c ->
            c.set(orderNo).equalToWhenPresent(record::getOrderNo)
            .set(orderId).equalToWhenPresent(record::getOrderId)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(goodsQuantity).equalToWhenPresent(record::getGoodsQuantity)
            .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
            .set(createAt).equalToWhenPresent(record::getCreateAt)
            .set(updateAt).equalToWhenPresent(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }
}