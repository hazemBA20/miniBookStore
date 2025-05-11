package com.bookstore.minibookstore.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.minibookstore.models.User;
@Component
public class UserRepository {
    private final List<User> Users;


   public UserRepository(List<User> Users) {
       this.Users = Users;
   }
   public UserRepository() {
       Users = new ArrayList<>();
   }
   public List<User> getUsers() {
       return Users;
   }

}
