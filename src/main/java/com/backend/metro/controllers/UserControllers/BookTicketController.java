package com.backend.metro.controllers.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend.metro.dto.Userdto.bookTicketdto;

@Controller
public class BookTicketController {
    
    @PostMapping("/bookTicket")
    public String bookTicket(@RequestBody bookTicketdto ticket) {
        return "Ticket booked successfully";
    }

    @GetMapping("/cancelTicket/{ticketId}")
    public String cancelTicket(@PathVariable int ticketId) {
        return "Ticket cancelled successfully";
    }

    @GetMapping("/ticketDetails/{ticketId}")
    public String ticketDetails(@PathVariable int ticketId) {
        return "Ticket details retrieved successfully";
    }

    @GetMapping("/allTickets")
    public String allTickets() {
        return "All tickets retrieved successfully";
    }
}
