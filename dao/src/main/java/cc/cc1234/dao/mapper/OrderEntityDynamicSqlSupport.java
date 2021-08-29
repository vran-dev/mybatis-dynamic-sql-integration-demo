package cc.cc1234.dao.mapper;

import cc.cc1234.core.domain.enums.OrderStatus;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7131771+08:00", comments="Source Table: order")
    public static final OrderEntity orderEntity = new OrderEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7136849+08:00", comments="Source field: order.id")
    public static final SqlColumn<Long> id = orderEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7136849+08:00", comments="Source field: order.user_id")
    public static final SqlColumn<Long> userId = orderEntity.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7137156+08:00", comments="Source field: order.order_no")
    public static final SqlColumn<String> orderNo = orderEntity.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7137156+08:00", comments="Source field: order.status")
    public static final SqlColumn<OrderStatus> status = orderEntity.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7137156+08:00", comments="Source field: order.create_at")
    public static final SqlColumn<LocalDateTime> createAt = orderEntity.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7137156+08:00", comments="Source field: order.update_at")
    public static final SqlColumn<LocalDateTime> updateAt = orderEntity.updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7131771+08:00", comments="Source Table: order")
    public static final class OrderEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<OrderStatus> status = column("`status`", JDBCType.TINYINT, "cc.cc1234.dao.EnumOrdinalTypeHandler");

        public final SqlColumn<LocalDateTime> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> updateAt = column("update_at", JDBCType.TIMESTAMP);

        public OrderEntity() {
            super("`order`");
        }
    }
}