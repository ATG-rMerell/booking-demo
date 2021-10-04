package com.atg.booking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Table(name = "BOOKING")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    @Builder.Default
    private int booked = 1;

    @Column
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    Instant time;

    @Column(name = "time_slot")
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private TimeSlot timeSlot;
}
