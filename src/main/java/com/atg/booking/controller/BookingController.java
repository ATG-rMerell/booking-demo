package com.atg.booking.controller;

import com.atg.booking.model.Booking;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class BookingController {

    @PostMapping("/booking")
    public Booking bookTime() {
        return Booking.builder().build();
    }

    @DeleteMapping("/booking/{id}")
    public void cancelBookedTime(@PathVariable("id") Long id) {
    }

    @GetMapping("/booking")
    public List<Booking> getBookedTimes() {
        return Collections.emptyList();
    }
}
