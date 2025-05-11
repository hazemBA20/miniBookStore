package com.bookstore.minibookstore.controllers;

import com.bookstore.minibookstore.models.User;
import com.bookstore.minibookstore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(path= "/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUsers() {
      List<User> users= userService.showUsers();
        return "<html><body>ok it s working<body><html>";//does not work
    }

}
