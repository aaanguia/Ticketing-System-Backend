package com.example.demo.Services;

import com.example.demo.model.ItTicket;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItTicketService {
    private TicketRepository ticketRepository;

    public ItTicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    public ItTicket saveTicket(ItTicket model) {
        return ticketRepository.save(model);
    }

    public List<ItTicket> getTickets(){
        return ticketRepository.findAll();
    }
    public ItTicket getTicketById(int id){
        return ticketRepository.findById(id).orElse(null);
    }

    public void deleteTicket(int id) {
        ticketRepository.deleteById(id);
    }

    public ItTicket updateTicket(ItTicket newTicket){
        if(ticketRepository.findById(newTicket.getId()).isPresent()){
            ItTicket current = ticketRepository.findById(newTicket.getId()).get();
            current.setTitle(newTicket.getTitle());
            current.setBody(newTicket.getBody());
            current.setCategory(newTicket.getCategory());
            return ticketRepository.save(current);
        } else{
            return null;
        }
    }

}
