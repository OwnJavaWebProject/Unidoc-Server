package com.sixth.unidoc.service;

import com.sixth.unidoc.domain.User;

import java.util.List;

public interface UserService {

    String insert(User user);

    List<User> getUsersList();
}
