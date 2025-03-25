package com.example.airlinemanagementsystem.repository;

import com.example.airlinemanagementsystem.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByFlightIdAndDepartureTimeAfter(Long flightId, LocalDateTime date);
}