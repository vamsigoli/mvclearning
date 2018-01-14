package com.vamsi.spring.mvc.mvclearn.service;

import com.vamsi.spring.mvc.mvclearn.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();

    User getUser(String id);
}
