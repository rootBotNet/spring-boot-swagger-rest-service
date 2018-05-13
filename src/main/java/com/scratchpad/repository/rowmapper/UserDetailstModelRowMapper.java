package com.scratchpad.repository.rowmapper;

import com.scratchpad.entity.UserDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDetailstModelRowMapper implements RowMapper<UserDetails> {
    @Override
    public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(rs.getInt("id"));
        userDetails.setName(rs.getString("name"));
        userDetails.setPassword(rs.getString("phone"));
        userDetails.setPassword(rs.getString("password"));
        return userDetails;
    }
}
