package cc.cc1234.api.vo.request;

import cc.cc1234.core.domain.enums.Gender;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserCreateRequest {

    @NotBlank
    private String username;

    @NotNull
    private Gender gender;

}
