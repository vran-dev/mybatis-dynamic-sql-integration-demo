package cc.cc1234.api.vo.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserLoginRequest {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
