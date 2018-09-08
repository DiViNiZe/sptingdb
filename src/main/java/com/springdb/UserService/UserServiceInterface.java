package com.springdb.UserService;

import java.util.List;

public interface UserServiceInterface {

  User getUserById(int id);
  List<User> getAllUser();
  
}