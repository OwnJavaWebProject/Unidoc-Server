package com.sixth.unidoc.service.impl;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.mapper.UserMapper;
import com.sixth.unidoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(User user) {
        userMapper.insert(user.getUsername(), user.getPassword());
        return "success";
    }

    @Override
    public List<User> getUsersList() {
        return null;
    }
}
