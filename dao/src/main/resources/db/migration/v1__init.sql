create table if not exists user
(
    id        bigint auto_increment primary key comment 'id',
    username  varchar(512) not null comment '用户名',
    gender    tinyint      not null default 0 comment '性别',
    create_at timestamp    not null default current_timestamp,
    update_at timestamp    not null default current_timestamp on update current_timestamp
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table if not exists `order`
(
    id        bigint auto_increment primary key comment 'id',
    user_id   bigint       not null comment 'userId',
    order_no  varchar(128) not null comment '订单号',
    status    tinyint(4)   not null comment '状态',
    create_at timestamp    not null default current_timestamp,
    update_at timestamp    not null default current_timestamp on update current_timestamp
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


create table if not exists order_item
(
    id             bigint auto_increment primary key comment 'id',
    order_no       varchar(128) not null comment '订单号',
    order_id       bigint       not null comment '订单id',
    goods_name     varchar(512) not null comment '商品名称',
    goods_quantity int          not null comment '商品数量',
    goods_price    int          not null comment '商品单价，单位 分',
    create_at      timestamp    not null default current_timestamp,
    update_at      timestamp    not null default current_timestamp on update current_timestamp
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;