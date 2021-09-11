package com.pluralsight.hibernatefundamentals;

import com.pluralsight.hibernatefundamentals.entity.Airport;
import com.pluralsight.hibernatefundamentals.entity.Passenger;
import com.pluralsight.hibernatefundamentals.entity.Ticket;
import com.pluralsight.hibernatefundamentals.impl.AirportHibernateImpl;
import com.pluralsight.hibernatefundamentals.impl.PassengerHibernateImpl;
import com.pluralsight.hibernatefundamentals.impl.TicketHibernateImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m02.ex01");
//        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();


        Airport airport1 = new Airport(1,"Henri Coanda");
        AirportHibernateImpl airportHibernateImpl1 = new AirportHibernateImpl();
        airportHibernateImpl1.saveAirport(airport1);

        Airport airport2 = new Airport(2,"SLC Airport");
        AirportHibernateImpl airportHibernateImpl2 = new AirportHibernateImpl();
        airportHibernateImpl2.saveAirport(airport2);

        Airport airport3 = new Airport(3,"LA Airport");
        AirportHibernateImpl airportHibernateImpl3 = new AirportHibernateImpl();
        airportHibernateImpl3.saveAirport(airport3);

        Airport airport4 = new Airport(4,"San Juan Airport");
        AirportHibernateImpl airportHibernateImpl4 = new AirportHibernateImpl();
        airportHibernateImpl4.saveAirport(airport4);

        Passenger passenger1 = new Passenger(1,"John Smith");
        PassengerHibernateImpl passengerHibernateImpl1 = new PassengerHibernateImpl();
        passengerHibernateImpl1.savePassenger(passenger1);

        Passenger passenger2 = new Passenger(2,"Michael Johnson");
        PassengerHibernateImpl passengerHibernateImpl2 = new PassengerHibernateImpl();
        passengerHibernateImpl2.savePassenger(passenger2);

        Passenger passenger3 = new Passenger(3,"Moira Leon");
        PassengerHibernateImpl passengerHibernateImpl3 = new PassengerHibernateImpl();
        passengerHibernateImpl3.savePassenger(passenger3);

        Passenger passenger4 = new Passenger(4,"Juliana Meza");
        PassengerHibernateImpl passengerHibernateImpl4 = new PassengerHibernateImpl();
        passengerHibernateImpl4.savePassenger(passenger4);

        Ticket ticket1 = new Ticket(1,"AA1234");
        TicketHibernateImpl ticketHibernateImpl1 = new TicketHibernateImpl();
        ticketHibernateImpl1.saveTicket(ticket1);

        Ticket ticket2 = new Ticket(2,"BB5678");
        TicketHibernateImpl ticketHibernateImpl2 = new TicketHibernateImpl();
        ticketHibernateImpl2.saveTicket(ticket2);

        Ticket ticket3 = new Ticket(3,"CC0987");
        TicketHibernateImpl ticketHibernateImpl3 = new TicketHibernateImpl();
        ticketHibernateImpl3.saveTicket(ticket3);

        Ticket ticket4 = new Ticket(4,"DD1436");
        TicketHibernateImpl ticketHibernateImpl4 = new TicketHibernateImpl();
        ticketHibernateImpl4.saveTicket(ticket4);




//        Passenger john = new Passenger(1,"John Smith");
//        john.setAirport(airport);
//        Passenger mike = new Passenger(2,"Michael Johnson");
//        mike.setAirport(airport);
//        airport.addPassengers(john);
//        airport.addPassengers(mike);
//
//
//        Ticket ticket1 = new Ticket(1,"AA1234");
//        ticket1.setPassenger(john);
//
//        Ticket ticket2 = new Ticket(2,"BB5678");
//        ticket2.setPassenger(john);
//
//        john.addTicket(ticket1);
//        john.addTicket(ticket2);
//
//        Ticket ticket3 = new Ticket(3,"CC0987");
//        ticket3.setPassenger(mike);
//        mike.addTicket(ticket3);
//
//        em.persist(airport);
//        em.persist(john);
//        em.persist(mike);
//
//        em.persist(ticket1);
//        em.persist(ticket2);
//        em.persist(ticket3);
//
//
//        em.getTransaction().commit();
//        emf.close();

    }
}
