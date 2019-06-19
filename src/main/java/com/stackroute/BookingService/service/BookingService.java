package com.stackroute.BookingService.service;

import com.stackroute.BookingService.domain.Booking;
import com.stackroute.BookingService.exceptions.BookingAlreadyExistsException;

import java.util.List;

public interface BookingService {

    public List<Booking> getAllBookings();
    public Booking saveBooking(Booking booking) throws  BookingAlreadyExistsException;
}