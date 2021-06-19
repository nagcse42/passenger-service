package com.asc.passenger.repository;

import com.asc.passenger.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassenegerDAO extends JpaRepository<Passenger, Integer> {
    Passenger findByPnr(String pnr);
    List<Passenger> findByFlightNumber(Integer flightNumber);
}
