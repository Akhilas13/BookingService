package com.stackroute.BookingService.exceptions;

public class BookingAlreadyExistsException extends Exception {

    String message;

    public BookingAlreadyExistsException() {
    }

    public BookingAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }

}
