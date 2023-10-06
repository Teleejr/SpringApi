package com.SpringApi.SpringApi.service;

import org.springframework.stereotype.Service;
import com.SpringApi.SpringApi.model.user.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Jae", 23, "jae@email.com");
        User user2 = new User(2, "Shaunice", 25, "shaunice@email.com");
        User user3 = new User(3, "Tariq", 21, "tariq@email.com");
        User user4 = new User(4, "Keyton", 19, "keyton@email.com");
        User user5 = new User(5, "Amari", 22, "amari@email.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
