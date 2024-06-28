package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {
    DateTimeService service = new DateTimeService();

    @Test
    public void positiveDaysCalculateTest() {
        Date firstDate = createDateByString("12.12.2023");
        Date secondDate = createDateByString("13.12.2023");
        long actualDays = service.calculateDaysBetween(firstDate, secondDate);
        assertEquals(actualDays, 1);
    }

    @Test
    public void negativeDaysCalculateTest() {
        Date firstDate = createDateByString("13.12.2023");
        Date secondDate = createDateByString("12.12.2023");
        long actualDays = service.calculateDaysBetween(firstDate, secondDate);
        assertEquals(actualDays, -1);
    }

    @Test
    public void zeroDaysCalculateTest() {
        Date firstDate = createDateByString("12.12.2023");
        Date secondDate = createDateByString("12.12.2023");
        long actualDays = service.calculateDaysBetween(firstDate, secondDate);
        assertEquals(actualDays, 0);
    }

    private Date createDateByString(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
