package com.sixth.unidoc.service;

import com.sixth.unidoc.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    String insert(User user);


    boolean isExist(User user);

    Map<String, String> findByUsername(String username);

    List<User> getUsersList();
}
