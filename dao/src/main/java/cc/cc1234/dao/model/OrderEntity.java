package cc.cc1234.dao.model;

import cc.cc1234.core.domain.enums.OrderStatus;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class OrderEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.status")
    private OrderStatus status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.create_at")
    private LocalDateTime createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.update_at")
    private LocalDateTime updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.status")
    public OrderStatus getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.status")
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.create_at")
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.create_at")
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.update_at")
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7683761+08:00", comments="Source field: order.update_at")
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}