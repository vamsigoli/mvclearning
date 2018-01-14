package com.vamsi.spring.mvc.mvclearn.service.impl;

import com.vamsi.spring.mvc.mvclearn.model.User;
import com.vamsi.spring.mvc.mvclearn.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private List<User> users = Arrays.asList(new User(1, "vamsi", "v@g.com"),
                                             new User(2, "geetha", "g@g.com"));

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(final String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().get();
    }

}
