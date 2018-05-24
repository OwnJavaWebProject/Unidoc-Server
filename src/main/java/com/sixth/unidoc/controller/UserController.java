package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.User;
import com.sixth.unidoc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
@Api(description = "用户操作，添加，查询，删除")
public class UserController {

    static Map<String, User> users = Collections.synchronizedMap(new HashMap<>());

    @Autowired
    private UserService userService;

    /***
     * 查询所有 用户列表
     * @return 用户列表
     */
    @ApiOperation("返回所有用户的列表")
    @GetMapping(value = "/")
    public List<User> getUsers() {
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    /***
     * 添加用户
     * @param user
     * @return
     */
    @ApiOperation("根据用户名查询用户")
    @PostMapping(value = "/")
    public String postUser(User user) {
        users.put(user.getUsername(), user);
        return "success";
    }

    @ApiOperation("根据用户名查询用户")
    @GetMapping(value = "/{username}")
    public User getUser(@PathVariable String username) {
        return users.get(username);
    }

    @ApiOperation("根据用户名添加用户")
    @PutMapping(value = "/{username}")
    public String putUser(@PathVariable String username) {
        User u = new User();
        u.setUsername(username);
        users.put(u.getUsername(), u);
        return "success";
    }

    @ApiOperation("根据用户名删除用户")
    @DeleteMapping(value = "/{username}")
    public String deleteUser(@PathVariable String username) {
        users.remove(username);
        return "success";
    }


    @GetMapping(value = "/Mybatis/{username}/{password}")
    public String insertUser(@PathVariable(value = "username") String username,
                             @PathVariable(value = "password") String password) {
        User temp = new User(username, password);
        return userService.insert(temp);
    }
}
