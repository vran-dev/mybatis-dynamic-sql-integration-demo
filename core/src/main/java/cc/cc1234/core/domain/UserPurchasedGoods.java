package cc.cc1234.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPurchasedGoods {

    private String goodsName;

    private Integer goodsQuantity;

}
