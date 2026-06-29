package com.wipro.fbs.main;

import java.util.ArrayList;

import com.wipro.fbs.entity.Booking;
import com.wipro.fbs.entity.Flight;
import com.wipro.fbs.entity.Passenger;
import com.wipro.fbs.service.BookingService;
import com.wipro.fbs.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Passenger> passengers = new ArrayList<>();

        passengers.add(new Passenger("P001",
                "Rahul Sharma",
                "9876543210"));

        passengers.add(new Passenger("P002",
                "Neha Gupta",
                "9123456780"));

        ArrayList<Flight> flights = new ArrayList<>();

        flights.add(new Flight(
                "AI101",
                "Delhi",
                "Mumbai",
                100,
                100,
                4500.0));

        flights.add(new Flight(
                "AI202",
                "Chennai",
                "Bangalore",
                60,
                60,
                2500.0));

        ArrayList<Booking> bookings = new ArrayList<>();

        BookingService service =
                new BookingService(passengers, flights, bookings);

        try {

            Booking booking =
                    service.bookFlight("P001",
                            "AI101",
                            "2025-02-14");

            System.out.println("Booking Successful!");
            System.out.println("Booking ID : "
                    + booking.getBookingId());

            System.out.println("\nPassenger Bookings");

            service.printPassengerBookings("P001");

            System.out.println("\nCancelling Booking...");

            service.cancelBooking(booking.getBookingId());

            System.out.println("Booking Cancelled Successfully.");

        }

        catch (InvalidPassengerException |
               FlightFullException |
               BookingNotFoundException |
               BookingOperationException e) {

            System.out.println(e);

        }

        catch (Exception e) {

            System.out.println("Unexpected Error : " + e);
        }
    }
}