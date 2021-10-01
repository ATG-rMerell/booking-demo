package com.atg.booking.model;

import lombok.Getter;

@Getter
public enum TimeSlot {
    MORNING("8-12"),
    AFTERNOON("12-16"),
    EVENING("16-20");

    private final String time;

    TimeSlot(String time) {
        this.time = time;
    }
}
