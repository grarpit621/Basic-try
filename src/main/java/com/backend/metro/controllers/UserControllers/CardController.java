package com.backend.metro.controllers.UserControllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend.metro.dto.Userdto.cardRechargedto;

@Controller
public class CardController {
    
    @PostMapping("/rechargeCard")
    public String rechargeCard(@RequestBody cardRechargedto recharge) {
        return "Card recharged successfully" + recharge.getAmount();
    }

    @GetMapping("/cardBalance")
    public String cardBalance(@RequestBody cardRechargedto balance) {
        return "Card balance is " + balance.getAmount();
    }

    @GetMapping("/cardHistory")
    public String cardHistory(@RequestBody List<cardRechargedto> history) {
        return "Card history retrieved successfully";
    }

}
