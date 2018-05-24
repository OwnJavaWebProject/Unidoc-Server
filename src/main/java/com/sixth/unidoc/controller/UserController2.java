/*package com.sixth.unidoc.controller;

import com.sixth.unidoc.dao.UserRepositroy;
import com.sixth.unidoc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
//@EnableAutoConfiguration
public class UserController {

    private UserRepositroy userRepositroy;

    @Autowired
    public UserController(UserRepositroy userRepositroy) {
        this.userRepositroy = userRepositroy;
    }

    @GetMapping("/register/{username}/{password}")
    public void save(@PathVariable("username") String username,
                     @PathVariable("password") String password) {
        User insave = new User(username, password);
        userRepositroy.save(insave);
    }
}*/
