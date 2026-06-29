package com.wipro.fbs.util;

public class BookingOperationException extends Exception {

    @Override
    public String toString() {
        return "BookingOperationException: Invalid booking operation.";
    }
}