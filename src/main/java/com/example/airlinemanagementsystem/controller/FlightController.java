package com.example.airlinemanagementsystem.controller;

import com.example.airlinemanagementsystem.entity.Flight;
import com.example.airlinemanagementsystem.entity.Schedule;
import com.example.airlinemanagementsystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort) {
        return flightService.getAllFlights(sort);
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @GetMapping("/{id}/schedules")
    public List<Schedule> getFlightSchedules(
            @PathVariable Long id,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dates) {
        return flightService.getFlightSchedules(id, dates);
    }
}