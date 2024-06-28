package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {

    @Test
    public void testCalculateTimeInMillisBetweenAgreementDays() {
        DateTimeService dateTimeService = new DateTimeService();
        Date dateFrom = new Date(1719219600000L);
        Date dateTo = new Date(1719306000000L);

        long expectedDifference = TimeUnit.DAYS.toMillis(1);
        long actualDifference = dateTimeService.calculateTimeInMillisBetweenTwoDays(dateFrom, dateTo);

        assertEquals(expectedDifference, actualDifference);
    }

    @Test
    public void testConvertTimeInMillisToDays() {
        DateTimeService dateTimeService = new DateTimeService();
        long timeInMillis = TimeUnit.DAYS.toMillis(4);

        long expectedDays = 4;
        long actualDays = dateTimeService.convertTimeInMillisToDays(timeInMillis);

        assertEquals(expectedDays, actualDays);
    }
}
