package com.backend.metro.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homePageController {
    
    @GetMapping("/")
    public String dashboard() {
        return "Welcome to Metro Backend Service";
    }   

}
