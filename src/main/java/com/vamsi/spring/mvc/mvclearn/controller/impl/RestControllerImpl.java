package com.vamsi.spring.mvc.mvclearn.controller.impl;

import com.vamsi.spring.mvc.mvclearn.controller.RestControllerInterface;
import com.vamsi.spring.mvc.mvclearn.model.User;
import com.vamsi.spring.mvc.mvclearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class RestControllerImpl implements RestControllerInterface {

    @Autowired
    private UserService userService;

    @Override
    public List<User> listUsers() {
        return userService.getUsers();
    }

    @Override
    public User getUser(@PathVariable  String id) {
        return userService.getUser(id);
    }

}
