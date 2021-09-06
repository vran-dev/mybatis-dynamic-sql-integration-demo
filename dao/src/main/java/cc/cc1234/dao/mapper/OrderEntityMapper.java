package cc.cc1234.dao.mapper;

import static cc.cc1234.dao.mapper.OrderEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cc.cc1234.dao.EnumOrdinalTypeHandler;
import cc.cc1234.dao.model.OrderEntity;
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
public interface OrderEntityMapper extends CommonSelectMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    BasicColumn[] selectList = BasicColumn.columnList(id, userId, orderNo, status, createAt, updateAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: order")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<OrderEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    @Insert({
        "${insertStatement}"
    })
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<OrderEntity> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int insertMultiple(MultiRowInsertStatementProvider<OrderEntity> multipleInsertStatement) {
        return insertMultiple(multipleInsertStatement.getInsertStatement(), multipleInsertStatement.getRecords());
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderEntityResult")
    Optional<OrderEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", typeHandler=EnumOrdinalTypeHandler.class, jdbcType=JdbcType.TINYINT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int insert(OrderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, orderEntity, c ->
            c.map(userId).toProperty("userId")
            .map(orderNo).toProperty("orderNo")
            .map(status).toProperty("status")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int insertMultiple(Collection<OrderEntity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, orderEntity, c ->
            c.map(userId).toProperty("userId")
            .map(orderNo).toProperty("orderNo")
            .map(status).toProperty("status")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int insertSelective(OrderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, orderEntity, c ->
            c.map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
            .map(updateAt).toPropertyWhenPresent("updateAt", record::getUpdateAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default Optional<OrderEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default List<OrderEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default List<OrderEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default Optional<OrderEntity> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(record::getUserId)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(updateAt).equalTo(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(record::getUserId)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(updateAt).equalToWhenPresent(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int updateByPrimaryKey(OrderEntity record) {
        return update(c ->
            c.set(userId).equalTo(record::getUserId)
            .set(orderNo).equalTo(record::getOrderNo)
            .set(status).equalTo(record::getStatus)
            .set(createAt).equalTo(record::getCreateAt)
            .set(updateAt).equalTo(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source Table: order")
    default int updateByPrimaryKeySelective(OrderEntity record) {
        return update(c ->
            c.set(userId).equalToWhenPresent(record::getUserId)
            .set(orderNo).equalToWhenPresent(record::getOrderNo)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(createAt).equalToWhenPresent(record::getCreateAt)
            .set(updateAt).equalToWhenPresent(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }
}