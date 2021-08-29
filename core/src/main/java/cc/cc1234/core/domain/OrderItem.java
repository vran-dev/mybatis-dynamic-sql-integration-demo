package cc.cc1234.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    private Long id;

    private Long orderId;

    private String goodsName;

    private Integer goodsQuantity;

    private Integer goodsPrice;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;
}
