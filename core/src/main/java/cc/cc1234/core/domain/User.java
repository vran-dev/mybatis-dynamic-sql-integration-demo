package cc.cc1234.core.domain;

import cc.cc1234.core.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private Gender gender;

    public void changeName(String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("user name must not be blank");
        }
        this.username = newName;
    }

    public void changeGender(Gender newGender) {
        if (newGender != this.gender) {
            gender = newGender;
        }
    }
}
