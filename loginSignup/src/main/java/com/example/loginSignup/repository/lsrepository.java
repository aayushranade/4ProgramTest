package com.example.loginSignup.repository;

import com.example.loginSignup.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class lsrepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertNewUser(String username, String email, String password) {
        String sql = "INSERT INTO aayushdb.ls(username,email,password) VALUES(?,?,?)";
        Object params[] = new Object[] {username,email,password};
        jdbcTemplate.update(sql,params);
    }
    public user getDetails(String password) {
        String sql = "SELECT * FROM aayushdb.ls WHERE password = ?";
        Object params[] = new Object[] {password};
        return jdbcTemplate.queryForObject(sql, params, BeanPropertyRowMapper.newInstance(user.class));
    }

}
