package com.atg.booking.repository;

import com.atg.booking.model.Booking;
import com.atg.booking.model.TimeSlot;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class BookingRepositoryTest {

    @Autowired
    BookingRepository bookingRepository;

    /*
     * A failing test, that should work when finished with the solution
     * */
    @Test
    void createBooking() {
        Instant time = Instant.now();
        Booking booking = Booking.builder().id(1L).time(time).timeSlot(TimeSlot.MORNING).booked(1).build();
        bookingRepository.save(booking);

        Optional<Booking> bookingById = bookingRepository.findBookingById(1L);
        assertTrue(bookingById.isPresent());
        assertEquals(booking.getBooked(), bookingById.get().getBooked());
        assertEquals(booking.getId(), bookingById.get().getId());
        assertEquals(booking.getTimeSlot(), bookingById.get().getTimeSlot());
    }
}
