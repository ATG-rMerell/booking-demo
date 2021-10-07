package com.atg.booking.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import(BookingService.class)
class BookingServiceTest {

    @Autowired
    BookingService bookingService;

    @Test
    void createBooking() {
    }

    @Test
    void cancelBooking() {

    }

    @Test
    void denyBookOnAlreadyBookedTime() {

    }

    @Test
    void getBookedTimes() {

    }

    // Maybe some more tests if there is time
}
