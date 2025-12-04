package com.backend.metro.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.backend.metro.dto.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody logindto user) {
        return "User logged : " + user.getUsername() + " with password: " + user.getPassword();
    }
}
