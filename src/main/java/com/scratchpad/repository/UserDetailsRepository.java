package com.scratchpad.repository;

import com.scratchpad.entity.UserDetails;
import com.scratchpad.repository.rowmapper.UserDetailstModelRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDetailsRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insert(UserDetails userDetails) {
        return jdbcTemplate.update(
                "insert into user_details ( name, phone, password) " + "values(?, ?, ?)",
                new Object[]{userDetails.getName(), userDetails.getPhone(), userDetails.getPassword()});
    }

    public List<UserDetails> findAll() {
        return jdbcTemplate.query("select * from user_details", new UserDetailstModelRowMapper());
    }

}
