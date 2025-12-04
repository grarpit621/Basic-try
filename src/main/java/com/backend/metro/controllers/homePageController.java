package com.backend.metro.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homePageController {
    
    @GetMapping("/")
    public String dashboard() { // localhost:8080/
        return "hi";
    }   

    @GetMapping("/home")
    public String home() { // localhost:8080/home
        return "home";
    }
}
