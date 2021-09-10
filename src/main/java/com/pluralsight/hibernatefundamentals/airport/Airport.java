package com.pluralsight.hibernatefundamentals.airport;


import javax.persistence.*;

@Entity
@Table(name = "AIRPORTS")
@Access(AccessType.FIELD)
public class Airport {

    @Id
    @Column(name = "ID")
    private int id;
}
