package com.wipro.fbs.util;

public class InvalidPassengerException extends Exception {

    @Override
    public String toString() {
        return "InvalidPassengerException: Passenger ID does not exist.";
    }
}