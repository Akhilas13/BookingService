package com.stackroute.BookingService.service;

import com.stackroute.BookingService.domain.Booking;
import com.stackroute.BookingService.exceptions.BookingAlreadyExistsException;
import com.stackroute.BookingService.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return  bookingRepository.findAll();
    }

    @Override
    public Booking saveBooking(Booking booking) throws BookingAlreadyExistsException {

        if(bookingRepository.existsById(booking.getPartitionId())) {
            throw new BookingAlreadyExistsException("partitionId Already Exists");
        }
        Booking savedBooking=bookingRepository.save(booking);
        return savedBooking;
    }

}


