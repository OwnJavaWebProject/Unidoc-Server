package com.sixth.unidoc.dao;

import com.sixth.unidoc.domain.User;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositroy {

    private JdbcTemplate jdbcTemplate;
    private JdbcOperations jdbcOperations;

    public UserRepositroy(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User save(User user) {
        insertUser(user);
        return user;
    }

    private User insertUser(User user) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("user");
        Map<String, String> args = new HashMap<>();
        args.put("username", user.getUsername());
        args.put("passwords", user.getPassword());
        jdbcInsert.execute(args);
        return user;
    }

}
