package com.stackroute.BookingService.exceptions;

public class BookingNotFoundException extends Exception {
    String message;

    public BookingNotFoundException() {
    }

    public BookingNotFoundException(String message) {
        super(message);
        this.message = message;
    }


}
