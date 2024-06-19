package org.javaguru.travel.insurance.core;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateAndtimeServiceTest {
    public void testGetDateAndTimeBetween() {
        Date start = new Date();
        Date end = new Date(start.getTime() + TimeUnit.DAYS.toMillis(5));

        DateAndTimeService service = new DateAndTimeService();
        long daysBetween = service.getDateAndTimeBetween(start, end);

        assertEquals(5, daysBetween);
    }
}
