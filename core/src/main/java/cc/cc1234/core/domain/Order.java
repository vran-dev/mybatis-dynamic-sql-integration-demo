package cc.cc1234.core.domain;

import cc.cc1234.core.domain.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long id;

    private String orderNo;

    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private LocalDateTime updateAt;

    private LocalDateTime createAt;

}
