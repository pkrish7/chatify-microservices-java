package com.chatify.controller;

import com.chatify.model.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final List<User> users = new ArrayList<User>();

    @PostMapping("/register")
    public String registerUser(@Valid @RequestBody User user) {
        users.add(user);
        return "User registered: " + user.getUsername();
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}
