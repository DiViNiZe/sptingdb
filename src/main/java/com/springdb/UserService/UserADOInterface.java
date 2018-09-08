package com.springdb.UserService;

import java.util.List;

public interface UserADOInterface {
  User getUserById(int id);
  List<User> getAllUser();
}