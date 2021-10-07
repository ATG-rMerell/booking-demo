package com.atg.booking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Date {
    @Length(min = 4, max = 4)
    private int year;
    @Max(value = 12, message = "Month should be between 1-12")
    @Min(value = 1, message = "Month should be between 1-12")
    private int month;
    @Max(value = 31, message = "Day should be between 1-31")
    @Min(value = 1, message = "Day should be between 1-31")
    private int day;

    public LocalDateTime toLocalDateTime() {
        return LocalDateTime.of(year, month, day, 0, 0);
    }
}
