package com.backend.metro.controllers.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {
    
    @GetMapping("/dashboard")
    public String dashboard() {
        return "User dashboard";
    }

    @DeleteMapping("/deleteAccount")
    public String deleteAccount() {
        return "Account deleted successfully";
    }

    @GetMapping("/viewProfile")
    public String viewProfile() {
        return "User profile details";
    }

    @GetMapping("/cardDetails")
    public String cardDetails() {
        return "User card details";
    }

    @PutMapping("/updateProfile")
    public String updateProfile() {
        return "Profile updated successfully";
    }


}
