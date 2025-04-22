package com.parkee.technical.controller;


import com.parkee.technical.model.Ticket;
import com.parkee.technical.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/checkin")
    Ticket checkInVehicle(@RequestBody Ticket newTicket){
        return ticketRepository.saveAndFlush(newTicket);
    }

    @DeleteMapping("/checkout")
    Ticket checkOutVehicle(@RequestBody Ticket newTicket){
        return ticketRepository.saveAndFlush(newTicket);
    }
}
