package com.wipro.fbs.util;

public class FlightFullException extends Exception {

    @Override
    public String toString() {
        return "FlightFullException: No seats available for this flight.";
    }
}