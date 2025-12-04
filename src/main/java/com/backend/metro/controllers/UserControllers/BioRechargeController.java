package com.backend.metro.controllers.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BioRechargeController {
    
    @PostMapping("/rechargeBio")
    public String rechargeBio(@RequestParam("aadharNumber") int aadharNumber,
                              @RequestParam("amount") int amount) {
        return "Biometric recharge successful" + aadharNumber + " with amount: " + amount;
    }

}
