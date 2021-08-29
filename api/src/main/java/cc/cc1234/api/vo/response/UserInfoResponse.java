package cc.cc1234.api.vo.response;

import cc.cc1234.core.domain.enums.Gender;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserInfoResponse {

    @NonNull
    private Long id;

    @NonNull
    private String username;

    @NonNull
    private Gender gender;
}
