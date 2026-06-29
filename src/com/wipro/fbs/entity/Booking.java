package com.wipro.fbs.entity;

public class Booking {

    private String bookingId;
    private String passengerId;
    private String flightId;
    private double fare;
    private String travelDate;

    public Booking() {

    }

    public Booking(String bookingId, String passengerId,
                   String flightId, double fare, String travelDate) {

        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.fare = fare;
        this.travelDate = travelDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    @Override
    public String toString() {
        return "\nBooking ID : " + bookingId +
                "\nPassenger ID : " + passengerId +
                "\nFlight ID : " + flightId +
                "\nTravel Date : " + travelDate +
                "\nFare : " + fare;
    }
}