package com.backend.metro.controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.backend.metro.dto.Admindto.stationDetailsdto;


@Controller
public class Station {
    
    @PostMapping("/addStation")
    public String addStation(@RequestBody stationDetailsdto station) {
        return "Station added successfully" + station.getStationname();
    }

    @GetMapping("/removeStation/{stationId}")
    public String removeStation() {
        return "Station removed successfully";
    }

    @GetMapping("/updateStation/{stationId}")
    public String updateStation() {
        return "Station updated successfully";
    }

    @GetMapping("/allStationsAdmin")
    public String getAllStationsAdmin() {
        return "List of all stations for admin";
    }

    @GetMapping("/stationDetailsAdmin/{stationId}")
    public String getStationDetailsAdmin() {
        return "Details of the station for admin";
    }

    @GetMapping("/allTrains")
    public String getAllTrains() {
        return "List of all trains";
    }

}
