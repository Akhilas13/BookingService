package com.stackroute.BookingService.repository;


import com.stackroute.BookingService.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,String> {

}
