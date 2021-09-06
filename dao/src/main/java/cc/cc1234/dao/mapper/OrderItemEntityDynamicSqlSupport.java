package cc.cc1234.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderItemEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    public static final OrderItemEntity orderItemEntity = new OrderItemEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.id")
    public static final SqlColumn<Long> id = orderItemEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.order_no")
    public static final SqlColumn<String> orderNo = orderItemEntity.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.order_id")
    public static final SqlColumn<Long> orderId = orderItemEntity.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.goods_name")
    public static final SqlColumn<String> goodsName = orderItemEntity.goodsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.goods_quantity")
    public static final SqlColumn<Integer> goodsQuantity = orderItemEntity.goodsQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.goods_price")
    public static final SqlColumn<Integer> goodsPrice = orderItemEntity.goodsPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.create_at")
    public static final SqlColumn<LocalDateTime> createAt = orderItemEntity.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.update_at")
    public static final SqlColumn<LocalDateTime> updateAt = orderItemEntity.updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source Table: order_item")
    public static final class OrderItemEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> goodsQuantity = column("goods_quantity", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodsPrice = column("goods_price", JDBCType.INTEGER);

        public final SqlColumn<LocalDateTime> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> updateAt = column("update_at", JDBCType.TIMESTAMP);

        public OrderItemEntity() {
            super("order_item");
        }
    }
}