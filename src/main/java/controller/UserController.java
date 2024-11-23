package com.crm.JAMS.controller;

import com.crm.JAMS.entity.User;
import com.crm.JAMS.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return authenticationService.registerUser(user);
    }

    @PostMapping("/login")
    public boolean loginUser(@RequestBody User user) {
        return authenticationService.authenticate(user.getUsername(), user.getPassword());
    }
}
