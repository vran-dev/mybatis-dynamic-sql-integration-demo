package cc.cc1234.dao.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class OrderItemEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_id")
    private Long orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_name")
    private String goodsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_quantity")
    private Integer goodsQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_price")
    private Integer goodsPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.create_at")
    private LocalDateTime createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.update_at")
    private LocalDateTime updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_id")
    public Long getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.order_id")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_name")
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_quantity")
    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_quantity")
    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_price")
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.goods_price")
    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.create_at")
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7693754+08:00", comments="Source field: order_item.create_at")
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.update_at")
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-09-06T19:34:49.7703758+08:00", comments="Source field: order_item.update_at")
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}