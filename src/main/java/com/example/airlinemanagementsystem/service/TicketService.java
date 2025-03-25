package com.example.airlinemanagementsystem.service;

import com.example.airlinemanagementsystem.entity.Schedule;
import com.example.airlinemanagementsystem.entity.Ticket;
import com.example.airlinemanagementsystem.exception.ResourceNotFoundException;
import com.example.airlinemanagementsystem.repository.ScheduleRepository;
import com.example.airlinemanagementsystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Ticket createTicket(Ticket ticket) {
        if (ticketRepository.findByTicketNumber(ticket.getTicketNumber()).isPresent()) {
            throw new IllegalArgumentException("Ticket number already exists");
        }
        Schedule schedule = scheduleRepository.findById(ticket.getSchedule().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Schedule not found"));
        ticket.setSchedule(schedule);
        ticket.setTicketNumber(UUID.randomUUID().toString()); // Auto-generate ticket number
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ticket not found with id: " + id));
    }

    public void deleteTicket(Long id) {
        Ticket ticket = getTicketById(id);
        ticketRepository.delete(ticket);
    }
}