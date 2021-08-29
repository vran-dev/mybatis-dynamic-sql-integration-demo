package cc.cc1234.dao.converter;

import cc.cc1234.core.domain.User;
import cc.cc1234.dao.model.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRecordConverter {

    User to(UserEntity entity);

    UserEntity from(User entity);
}
