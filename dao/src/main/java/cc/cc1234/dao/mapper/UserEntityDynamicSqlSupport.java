package cc.cc1234.dao.mapper;

import cc.cc1234.core.domain.enums.Gender;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120396+08:00", comments="Source Table: user")
    public static final UserEntity userEntity = new UserEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source field: user.id")
    public static final SqlColumn<Long> id = userEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source field: user.username")
    public static final SqlColumn<String> username = userEntity.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source field: user.gender")
    public static final SqlColumn<Gender> gender = userEntity.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source field: user.create_at")
    public static final SqlColumn<LocalDateTime> createAt = userEntity.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source field: user.update_at")
    public static final SqlColumn<LocalDateTime> updateAt = userEntity.updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7120949+08:00", comments="Source Table: user")
    public static final class UserEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<Gender> gender = column("gender", JDBCType.TINYINT, "cc.cc1234.dao.EnumOrdinalTypeHandler");

        public final SqlColumn<LocalDateTime> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> updateAt = column("update_at", JDBCType.TIMESTAMP);

        public UserEntity() {
            super("user");
        }
    }
}