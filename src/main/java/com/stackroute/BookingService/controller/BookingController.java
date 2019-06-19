package com.stackroute.BookingService.controller;

import com.stackroute.BookingService.domain.Booking;
import com.stackroute.BookingService.exceptions.BookingAlreadyExistsException;
import com.stackroute.BookingService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="api/v1")

public class BookingController {

    BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("booking")
    public ResponseEntity<?> saveBooking(@RequestBody Booking booking)  throws BookingAlreadyExistsException {
        ResponseEntity responseEntity;
        try {
            bookingService.saveBooking(booking);
            responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);

        } catch (BookingAlreadyExistsException ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);

        }
        return responseEntity;
    }

    @GetMapping("booking")
    public ResponseEntity<?>getAllBookings(){
        return  new ResponseEntity<List<Booking>>(bookingService.getAllBookings(),HttpStatus.OK);
    }


    }


