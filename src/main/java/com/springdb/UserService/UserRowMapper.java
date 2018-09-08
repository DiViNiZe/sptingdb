package com.springdb.UserService;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

  @Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    int id = rs.getInt("id");
    String firstname = rs.getString("firstname");
    String lastname = rs.getString("lastname");
    User user = new User(id,firstname,lastname);
    return user;
	}

}