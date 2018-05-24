package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired UserMapper userMapper;

    @PostMapping("/register")
    public String save(@RequestParam("username") String username,
                       @RequestParam("password") String password){
        userMapper.insert(username,password);
        return "注册成功";
    }
}
