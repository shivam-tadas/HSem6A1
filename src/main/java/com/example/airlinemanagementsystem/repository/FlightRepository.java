package com.example.airlinemanagementsystem.repository;

import com.example.airlinemanagementsystem.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByOrderByFlightNumberAsc();
}