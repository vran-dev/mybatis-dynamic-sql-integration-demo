package cc.cc1234.core.service;

import cc.cc1234.core.domain.User;
import cc.cc1234.core.domain.UserPurchasedGoods;
import cc.cc1234.core.domain.enums.Gender;
import cc.cc1234.core.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listUsers(long page, long size) {
        return userRepository.list(page, size);
    }

    public User createUser(User user) {
        val id = userRepository.insertAndReturnPrimaryKey(user);
        user.setId(id);
        return user;
    }

    public Boolean deleteUser(Long id) {
        return userRepository.deleteByPrimaryKey(id);
    }

    public Optional<User> getUser(Long id) {
        return userRepository.selectByPrimaryKey(id);
    }

    public Boolean updateBasicInfo(Long id,
                                   String name,
                                   Gender gender) {
        var user = userRepository.selectByPrimaryKey(id)
                .orElseThrow();
        user.changeName(name);
        user.changeGender(gender);
        return userRepository.updateByPrimaryKey(user);
    }

    public List<UserPurchasedGoods> getUserPurchasedGoods(Long userId) {
        return userRepository.selectUserPurchasedOrders(userId);
    }

}
