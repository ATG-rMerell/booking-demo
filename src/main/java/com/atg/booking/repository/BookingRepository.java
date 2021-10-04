package com.atg.booking.repository;

import com.atg.booking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BookingRepository extends CrudRepository<Booking, Long> {

}
