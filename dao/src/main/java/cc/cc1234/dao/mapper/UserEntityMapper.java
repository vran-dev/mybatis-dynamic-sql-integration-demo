package cc.cc1234.dao.mapper;

import static cc.cc1234.dao.mapper.UserEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cc.cc1234.dao.EnumOrdinalTypeHandler;
import cc.cc1234.dao.model.UserEntity;
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
public interface UserEntityMapper extends CommonSelectMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, gender, createAt, updateAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<UserEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @Insert({
        "${insertStatement}"
    })
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<UserEntity> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int insertMultiple(MultiRowInsertStatementProvider<UserEntity> multipleInsertStatement) {
        return insertMultiple(multipleInsertStatement.getInsertStatement(), multipleInsertStatement.getRecords());
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserEntityResult")
    Optional<UserEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", typeHandler=EnumOrdinalTypeHandler.class, jdbcType=JdbcType.TINYINT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int insert(UserEntity record) {
        return MyBatis3Utils.insert(this::insert, record, userEntity, c ->
            c.map(username).toProperty("username")
            .map(gender).toProperty("gender")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int insertMultiple(Collection<UserEntity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userEntity, c ->
            c.map(username).toProperty("username")
            .map(gender).toProperty("gender")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default int insertSelective(UserEntity record) {
        return MyBatis3Utils.insert(this::insert, record, userEntity, c ->
            c.map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
            .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
            .map(updateAt).toPropertyWhenPresent("updateAt", record::getUpdateAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default Optional<UserEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default List<UserEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7673764+08:00", comments="Source Table: user")
    default List<UserEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    default Optional<UserEntity> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(UserEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalTo(record::getUsername)
                .set(gender).equalTo(record::getGender)
                .set(createAt).equalTo(record::getCreateAt)
                .set(updateAt).equalTo(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalToWhenPresent(record::getUsername)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(updateAt).equalToWhenPresent(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    default int updateByPrimaryKey(UserEntity record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(gender).equalTo(record::getGender)
            .set(createAt).equalTo(record::getCreateAt)
            .set(updateAt).equalTo(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(UserEntity record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(gender).equalToWhenPresent(record::getGender)
            .set(createAt).equalToWhenPresent(record::getCreateAt)
            .set(updateAt).equalToWhenPresent(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }
}