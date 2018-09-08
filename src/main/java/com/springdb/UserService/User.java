package com.springdb.UserService;


public class User {
    private int id;
    private String firstName;
    private String lastName;

    public User(int id,String firstname,String lastname){
      this.id = id;
      this.firstName = firstname;
      this.lastName = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
      return lastName;
  }

  public void setLastname(String lastname) {
      this.lastName = lastname;
  }
}
