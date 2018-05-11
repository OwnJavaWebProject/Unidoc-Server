package com.sixth.unidoc.service;

import com.sixth.unidoc.dao.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepositroy userRepositroy;

}
