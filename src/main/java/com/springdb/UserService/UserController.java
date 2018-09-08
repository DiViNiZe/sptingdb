
package com.springdb.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController{
  @Autowired
  UserService userService;

  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUser(@PathVariable("id") int id) {
      User user = userService.getUserById(id);
      return new ResponseEntity<User>(user,HttpStatus.OK);

  }

  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUserList() {
    List<User> user = userService.getAllUser();
    return new ResponseEntity<List<User>>(user,HttpStatus.OK);
}



}