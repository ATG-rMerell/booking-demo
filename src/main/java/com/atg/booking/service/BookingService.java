package com.atg.booking.service;

import com.atg.booking.model.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    public Booking bookTime() {
        return Booking.builder().id(1).build();
    }
}
