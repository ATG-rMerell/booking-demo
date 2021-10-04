package com.atg.booking.controller;

import com.atg.booking.model.Booking;
import com.atg.booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    // Dependency injected bean
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/booking")
    public Booking bookTime() {
        return bookingService.bookTime();
    }

    @DeleteMapping("/booking/{id}")
    public void cancelBookedTime(@PathVariable("id") Long id) {
    }

    @GetMapping("/booking")
    public List<Booking> getBookedTimes() {
        return Collections.emptyList();
    }
}
