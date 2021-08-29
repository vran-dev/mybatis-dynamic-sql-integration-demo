package cc.cc1234.api.converter;

import cc.cc1234.api.vo.request.UserBasicInfoUpdateRequest;
import cc.cc1234.api.vo.request.UserCreateRequest;
import cc.cc1234.api.vo.response.UserInfoResponse;
import cc.cc1234.core.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityConverter {

    User from(UserCreateRequest request);

    User from(Long id, UserBasicInfoUpdateRequest request);

    UserInfoResponse toUserInfoResponse(User entity);
}
