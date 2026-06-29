package com.wipro.fbs.service;

import java.util.ArrayList;

import com.wipro.fbs.entity.Booking;
import com.wipro.fbs.entity.Flight;
import com.wipro.fbs.entity.Passenger;
import com.wipro.fbs.util.*;

public class BookingService {

    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;

    public BookingService(ArrayList<Passenger> passengers,
                          ArrayList<Flight> flights,
                          ArrayList<Booking> bookings) {

        this.passengers = passengers;
        this.flights = flights;
        this.bookings = bookings;
    }

    public boolean validatePassenger(String passengerId)
            throws InvalidPassengerException {

        for (Passenger p : passengers) {
            if (p.getPassengerId().equals(passengerId)) {
                return true;
            }
        }

        throw new InvalidPassengerException();
    }

    public Flight findFlight(String flightId)
            throws BookingOperationException {

        for (Flight f : flights) {
            if (f.getFlightId().equals(flightId)) {
                return f;
            }
        }

        throw new BookingOperationException();
    }

    public double calculateFare(Flight flight) {

        return flight.getBaseFare() + (flight.getBaseFare() * 0.18);
    }

    public Booking bookFlight(String passengerId,
                              String flightId,
                              String date) throws Exception {

        validatePassenger(passengerId);

        Flight flight = findFlight(flightId);

        if (flight.getAvailableSeats() <= 0) {
            throw new FlightFullException();
        }

        flight.setAvailableSeats(flight.getAvailableSeats() - 1);

        double fare = calculateFare(flight);

        String bookingId = "BKG" + (bookings.size() + 1);

        Booking booking = new Booking(
                bookingId,
                passengerId,
                flightId,
                fare,
                date);

        bookings.add(booking);

        return booking;
    }

    public void cancelBooking(String bookingId)
            throws BookingNotFoundException {

        Booking booking = null;

        for (Booking b : bookings) {

            if (b.getBookingId().equals(bookingId)) {
                booking = b;
                break;
            }
        }

        if (booking == null) {
            throw new BookingNotFoundException();
        }

        Flight flight = null;

        for (Flight f : flights) {

            if (f.getFlightId().equals(booking.getFlightId())) {
                flight = f;
                break;
            }
        }

        if (flight != null) {
            flight.setAvailableSeats(flight.getAvailableSeats() + 1);
        }

        bookings.remove(booking);
    }

    public void printPassengerBookings(String passengerId) {

        boolean found = false;

        for (Booking b : bookings) {

            if (b.getPassengerId().equals(passengerId)) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bookings found.");
        }
    }
}