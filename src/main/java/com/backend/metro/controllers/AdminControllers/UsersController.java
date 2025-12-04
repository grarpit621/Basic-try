package com.backend.metro.controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    
    @GetMapping("/allUsers")
    public String getAllUsers() {
        return "List of all users";
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser() {
        return "User deleted successfully";
    }

    @GetMapping("/userDetails/{userId}")
    public String getUserDetails() {
        return "Details of the user";
    }

    @GetMapping("/activeUsers")
    public String getActiveUsers() {
        return "List of active users";
    }

    @GetMapping("/userDetails/{userID}/cards")
    public String getUserCards() {
        return "List of user's cards";
    }

    @GetMapping("/userDetails/{userID}/history")
    public String getUserHistory() {
        return "User's transaction history";
    }

    @GetMapping("/userDetails/{userID}/transactions")
    public String getUserTransactions() {
        return "List of user's transactions";
    }

    
}
