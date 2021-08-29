package cc.cc1234.api.facade;

import cc.cc1234.api.converter.UserEntityConverter;
import cc.cc1234.api.converter.UserPurchasedOrderConverter;
import cc.cc1234.api.vo.request.UserBasicInfoUpdateRequest;
import cc.cc1234.api.vo.request.UserCreateRequest;
import cc.cc1234.api.vo.response.UserInfoResponse;
import cc.cc1234.api.vo.response.UserPurchasedGoodsResponse;
import cc.cc1234.core.domain.User;
import cc.cc1234.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private UserEntityConverter userEntityConverter;

    @Autowired
    private UserPurchasedOrderConverter userPurchasedOrderConverter;

    public List<User> listUsers(long page, long size) {
        return userService.listUsers(page, size);
    }

    public UserInfoResponse createUser(UserCreateRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .gender(request.getGender())
                .build();
        return userEntityConverter.toUserInfoResponse(userService.createUser(user));
    }

    public Boolean deleteUser(Long id) {
        return userService.deleteUser(id);
    }

    public UserInfoResponse getUser(Long id) {
        return userService.getUser(id)
                .map(user -> userEntityConverter.toUserInfoResponse(user))
                .orElse(null);
    }

    public UserInfoResponse updateBasicInfo(Long id,
                                            UserBasicInfoUpdateRequest request) {
        userService.updateBasicInfo(id, request.getUsername(), request.getGender());
        return userService.getUser(id)
                .map(entity -> userEntityConverter.toUserInfoResponse(entity))
                .orElse(null);
    }

    public List<UserPurchasedGoodsResponse> getUserPurchasedGoods(Long userId) {
        return userService.getUserPurchasedGoods(userId)
                .stream()
                .map(userPurchasedOrderConverter::to)
                .collect(Collectors.toList());
    }
}
