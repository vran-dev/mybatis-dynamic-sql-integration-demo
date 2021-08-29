package cc.cc1234.dao.model;

import cc.cc1234.core.domain.enums.Gender;

import javax.annotation.Generated;
import java.time.LocalDateTime;

public class UserEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.gender")
    private Gender gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.create_at")
    private LocalDateTime createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.update_at")
    private LocalDateTime updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.gender")
    public Gender getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.create_at")
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.create_at")
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.update_at")
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-08-29T21:59:12.7115305+08:00", comments="Source field: user.update_at")
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}