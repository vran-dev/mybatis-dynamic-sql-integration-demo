package cc.cc1234.api.vo.response;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserPurchasedGoodsResponse {

    @NonNull
    private String goodsName;

    @NonNull
    private Integer goodsQuantity;

}
