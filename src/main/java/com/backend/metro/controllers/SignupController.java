package com.backend.metro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend.metro.dto.*;

@Controller
public class SignupController {

    @PostMapping("/signup")
    public String signup(@RequestBody signupdto user) {
        return "User signed up successfully" + user.getUsername();
    }
    
}
