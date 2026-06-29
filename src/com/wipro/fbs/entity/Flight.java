package com.wipro.fbs.entity;

public class Flight {

    private String flightId;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;
    private double baseFare;

    public Flight() {

    }

    public Flight(String flightId, String source, String destination,
                  int totalSeats, int availableSeats, double baseFare) {

        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.baseFare = baseFare;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    @Override
    public String toString() {
        return "Flight ID : " + flightId +
                "\nSource : " + source +
                "\nDestination : " + destination +
                "\nAvailable Seats : " + availableSeats +
                "\nBase Fare : " + baseFare;
    }
}