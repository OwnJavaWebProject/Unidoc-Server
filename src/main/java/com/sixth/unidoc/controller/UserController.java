package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/registerForm")
    public String save(User user) {
        userService.save(user);
        System.out.println("成功保存");
        return "redirect:/";
    }

    @PostMapping("/loginForm")
    public String userlogin(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        if (userService.checkAndlog(username, password)) {
            System.out.println("登录成功");
            return "redirect:/daohang";
        }
        return "redirect:/";
    }
}
