package com.atg.booking.repository;

import com.atg.booking.model.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface BookingRepository extends CrudRepository<Booking, Long> {
    /*
     * Example Queries, both returning the same result
     *
     * First one using built in JPA queries
     * Second one using a custom query
     * */

    Optional<Booking> findBookingById(Long id);

    @Query("SELECT b from Booking b where b.id = :id")
    Optional<Booking> findById(@Param("id") Long id);
}
