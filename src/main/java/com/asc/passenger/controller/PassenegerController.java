package com.asc.passenger.controller;

import com.asc.passenger.entity.Passenger;
import com.asc.passenger.service.PassenegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassenegerController {
    @Autowired
    private PassenegerService passenegerService;

    @PostMapping("/save")
    public Passenger savePassenger(@RequestBody Passenger passenger) {
        return passenegerService.savePassenger(passenger);
    }

    @GetMapping("/fetch/{id}")
    public Passenger fetchPassengerById(@RequestBody String pnr) {
        return passenegerService.fetchPassengerById(pnr);
    }

}
