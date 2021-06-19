package com.asc.passenger.service;

import com.asc.passenger.entity.Passenger;
import com.asc.passenger.repository.PassenegerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassenegerService {
    @Autowired
    private PassenegerDAO passenegerDAO;

    public Passenger savePassenger(Passenger passenger) {
        return passenegerDAO.save(passenger);
    }

    public Passenger fetchPassengerById(String pnr) {
       return passenegerDAO.findByPnr(pnr);
    }

    public List<Passenger> fetchFlightPassengers(Integer flightNumber) {
        return passenegerDAO.findByFlightNumber(flightNumber);
    }
}
