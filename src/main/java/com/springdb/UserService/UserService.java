package com.springdb.UserService;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

  @Autowired
  private UserADO userado;

  @Override
  public User getUserById(int id){
    User user = userado.getUserById(id);
    return user;
  }

  @Override
  public List<User> getAllUser(){
    return  userado.getAllUser();
  }
}