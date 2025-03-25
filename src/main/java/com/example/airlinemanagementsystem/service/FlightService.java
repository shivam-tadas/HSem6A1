package com.example.airlinemanagementsystem.service;

import com.example.airlinemanagementsystem.entity.Flight;
import com.example.airlinemanagementsystem.entity.Schedule;
import com.example.airlinemanagementsystem.exception.ResourceNotFoundException;
import com.example.airlinemanagementsystem.repository.FlightRepository;
import com.example.airlinemanagementsystem.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Flight> getAllFlights(String sort) {
        if ("asc".equalsIgnoreCase(sort)) {
            return flightRepository.findAllByOrderByFlightNumberAsc();
        }
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Flight not found with id: " + id));
    }

    public List<Schedule> getFlightSchedules(Long flightId, LocalDateTime date) {
        return scheduleRepository.findByFlightIdAndDepartureTimeAfter(flightId, date != null ? date : LocalDateTime.now());
    }
}