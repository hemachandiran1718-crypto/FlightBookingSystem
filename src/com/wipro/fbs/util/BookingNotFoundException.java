package com.wipro.fbs.util;

public class BookingNotFoundException extends Exception {

    @Override
    public String toString() {
        return "BookingNotFoundException: Booking not found.";
    }
}