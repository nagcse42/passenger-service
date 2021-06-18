package com.asc.passenger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passenger {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String pnr;
    private Integer referenceNumber;
    private String carrierCode;
    private Integer flightNumber;
}
