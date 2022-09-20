package com.example.demo.repository;

import com.example.demo.model.ItTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  TicketRepository extends JpaRepository<ItTicket, Integer> {
}
