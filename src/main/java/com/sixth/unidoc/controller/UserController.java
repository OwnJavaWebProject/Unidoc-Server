package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/register")
    public String save(@RequestParam("username") String username,
                       @RequestParam("email") String email,
                       @RequestParam("password") String password,
                       @RequestParam("phone") String phone) {
        userMapper.save(new User(username, email, password, phone));
        return "redirect:/";
    }

    @PostMapping("/login")
    public String userlogin(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        if (userMapper.findByUsername(username).get("password").equals(password)) {
            System.out.println("登录成功");
        } else {
            return "redirect:/";
        }
        return "redirect:/";
    }
}
