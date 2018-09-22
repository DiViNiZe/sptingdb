package com.springdb.UserService;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class UserADO implements UserADOInterface{

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public User getUserById(int id){
    final String SQL = "SELECT id,first_name,last_name FROM db59060.users WHERE id = ?";
    return jdbcTemplate.queryForObject(SQL,new UserRowMapper(),id);

  }

  @Override
  public List<User> getAllUser(){
    final String SQL = "SELECT id,firstname,lastname FROM db59060.users";
    RowMapper<User> rowmapper = new UserRowMapper();
    return jdbcTemplate.query(SQL,rowmapper);

  }
}