package org.javaguru.travel.insurance.core;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateAndTimeService {
    long getDateAndTimeBetween(Date start, Date end) {
        long distance = end.getTime() - start.getTime();
        return TimeUnit.DAYS.convert(distance, TimeUnit.MILLISECONDS);
    }
}
