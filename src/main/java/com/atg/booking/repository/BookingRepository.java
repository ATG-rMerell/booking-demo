package com.atg.booking.repository;

import com.atg.booking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findByBookedTrue(); //you could also use findByActiveFalse

}
