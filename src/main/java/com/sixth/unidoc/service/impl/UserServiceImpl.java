package com.sixth.unidoc.service.impl;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.repository.UserRepository;
import com.sixth.unidoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String insert(User user) {
        return "success";
    }

    @Override
    public boolean isExist(User user) {
        return true;
    }

    @Override
    public Map<String, String> findByUsername(String username) {
        return null;
    }


    @Override
    public List<User> getUsersList() {
        return null;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean checkAndlog(String username, String password) {
        String pass = userRepository.findByUsername(username).getPassword();
        return pass.equals(password);
    }
}
