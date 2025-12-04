package com.backend.metro.controllers.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend.metro.dto.Userdto.checkstatusdto;

@Controller
public class CheckStatusOfTrainSystem {
    
    @GetMapping("/checkTrainStatus")
    public String checkTrainStatus(@RequestBody checkstatusdto status) {
        return "Train status checked successfully" + status.getSourcestation() + " to " + status.getDestinationstation();
    }
}
