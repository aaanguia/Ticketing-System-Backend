package com.example.demo.controller;

import com.example.demo.Services.ItTicketService;
import com.example.demo.model.ItTicket;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class ItTicketController {

//    @Autowired
    private ItTicketService ticketService;

    @Autowired
    public ItTicketController(ItTicketService ticketService){
        this.ticketService = ticketService;
    }

    @PostMapping("addTicket")
    public ItTicket addTicket(@RequestBody ItTicket ticket){
        return ticketService.saveTicket(ticket);
    }

    @GetMapping("tickets")
    public List<ItTicket> getItTickets() {return ticketService.getTickets();}

    @GetMapping("tickets/{id}")
    public ItTicket getTicket(@PathVariable int id) {
        return ticketService.getTicketById(id);
    }

    @DeleteMapping("tickets/delete/{id}")
    public void deleteTicket(@PathVariable int id) {
        ticketService.deleteTicket(id);
    }

    @PostMapping("updateTicket")
    public ItTicket updateTicket(@RequestBody ItTicket ticket) {
        return ticketService.updateTicket(ticket);
    }


}
