package cc.cc1234.api.controller;

import cc.cc1234.api.facade.UserFacade;
import cc.cc1234.api.vo.request.UserBasicInfoUpdateRequest;
import cc.cc1234.api.vo.request.UserCreateRequest;
import cc.cc1234.api.vo.response.UserInfoResponse;
import cc.cc1234.api.vo.response.UserPurchasedGoodsResponse;
import cc.cc1234.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/api")
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @PostMapping("/user")
    public UserInfoResponse register(@RequestBody @Validated UserCreateRequest request) {
        return userFacade.createUser(request);
    }

    @DeleteMapping("/users/{id}")
    public Boolean delete(@PathVariable Long id) {
        return userFacade.deleteUser(id);
    }

    @PatchMapping("/users/{id}")
    public UserInfoResponse updateBasicInfo(@PathVariable Long id,
                                            @RequestBody UserBasicInfoUpdateRequest request) {
        return userFacade.updateBasicInfo(id, request);
    }

    @GetMapping("/users")
    public List<User> list(@RequestParam(defaultValue = "1") Long page,
                           @RequestParam(defaultValue = "20") Long size) {
        return userFacade.listUsers(page, size);
    }

    @GetMapping("/users/{id}")
    public UserInfoResponse getDetail(@PathVariable Long id) {
        return userFacade.getUser(id);
    }

    @GetMapping("/users/{userId}/goods/purchased")
    public List<UserPurchasedGoodsResponse> getUserPurchasedGoods(@PathVariable Long userId) {
        return userFacade.getUserPurchasedGoods(userId);
    }

}
