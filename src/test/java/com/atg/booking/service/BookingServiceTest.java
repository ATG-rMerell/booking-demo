package com.atg.booking.service;

import com.atg.booking.model.Booking;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@Import(BookingService.class)
class BookingServiceTest {

    @Autowired
    BookingService bookingService;

    @Test
    void createBooking(){
        Booking booking = bookingService.bookTime();
        assertEquals(1, booking.getId());
    }

    @Test
    void cancelBooking() {

    }

    @Test
    void denyBookOnAlreadyBookedTime(){

    }

    @Test
    void getBookedTimes() {

    }

    // Maybe some more tests if there is time
}
