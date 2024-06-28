package org.javaguru.travel.insurance.core;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {
    public long calculateDaysBetween(Date firstDate, Date secondDate) {
        long diffMillis = secondDate.getTime() - firstDate.getTime();
        return TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS);
    }
}
