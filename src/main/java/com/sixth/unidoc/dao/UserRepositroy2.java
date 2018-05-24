/*package com.sixth.unidoc.dao;

import com.sixth.unidoc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositroy2 {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepositroy2(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User save(User userDomain) {
        insertUser(userDomain);
        return userDomain;
    }

    private User insertUser(User userDomain) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("userDomain");
        Map<String, String> args = new HashMap<>();
        args.put("username", userDomain.getUsername());
        args.put("passwords", userDomain.getPassword());
        jdbcInsert.execute(args);
        return userDomain;
    }

}*/
