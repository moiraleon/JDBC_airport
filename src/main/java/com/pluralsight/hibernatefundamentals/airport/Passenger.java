package com.pluralsight.hibernatefundamentals.airport;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGERS")
public class Passenger {


    @Id
    @Column(name = "ID")
    private int id;
}
