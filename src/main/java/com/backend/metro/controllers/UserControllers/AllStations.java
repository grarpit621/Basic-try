package com.backend.metro.controllers.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllStations {
    
    @GetMapping("/allStations")
    public String getAllStations() {
        return "List of all metro stations";
    }

    @GetMapping("/stationDetails/{stationId}")
    public String getStationDetails() {
        return "Details of the metro station";
    }

    
}
