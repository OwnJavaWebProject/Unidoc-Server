package com.sixth.unidoc.service.impl;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.mapper.UserMapper;
import com.sixth.unidoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(User user) {
        userMapper.save(user);
        return "success";
    }

    @Override
    public boolean isExist(User user) {
        return userMapper.isExist(user);
    }

    @Override
    public Map<String, String> findByUsername(String username) {
        return userMapper.findByUsername(username);
    }


    @Override
    public List<User> getUsersList() {
        return null;
    }
}
