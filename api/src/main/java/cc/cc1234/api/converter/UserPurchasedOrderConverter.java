package cc.cc1234.api.converter;

import cc.cc1234.api.vo.response.UserPurchasedGoodsResponse;
import cc.cc1234.core.domain.UserPurchasedGoods;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPurchasedOrderConverter {
    UserPurchasedGoodsResponse to(UserPurchasedGoods userPurchasedOrder);
}
