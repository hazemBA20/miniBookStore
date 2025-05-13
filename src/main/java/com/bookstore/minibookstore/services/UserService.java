package com.bookstore.minibookstore.services;

import com.bookstore.minibookstore.models.User;
import com.bookstore.minibookstore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> showUsers() {
        return userRepository.getUsers();

    }


}
