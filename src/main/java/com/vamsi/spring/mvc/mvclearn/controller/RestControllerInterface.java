package com.vamsi.spring.mvc.mvclearn.controller;

import com.vamsi.spring.mvc.mvclearn.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public interface RestControllerInterface {

    @GetMapping("/list")
    public List<User> listUsers();

    @GetMapping("{id}")
    public User getUser(@PathVariable String id);
}
