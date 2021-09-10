package com.pluralsight.hibernatefundamentals.airport;


import javax.persistence.*;

@Entity
@Table(name = "PASSENGERS")
public class Passenger {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "AIRPORT_ID")
    private Airport airport;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Passenger(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
