package com.bookstore.minibookstore.services;

import com.bookstore.minibookstore.models.User;
import com.bookstore.minibookstore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
@Service
public class LoginUtilityService {

    @Autowired
    UserRepository usersRepository;


    public User findMatch(String username) {
        User user = usersRepository.findByName(username);
        if (user == null) {

            throw new UsernameNotFoundException("UserName " + username + " doesn't exists");
        }
        return user;

    }


}