package com.bookstore.minibookstore.repositories;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.minibookstore.models.User;

@Component
public class UserRepository {
    private final List<User> users;


   public UserRepository() {
       this.users = new ArrayList<>();
   }
   public List<User> getUsers() {
       return users;
   }

    public void save(User user) {
       users.add(user);
    }
}
