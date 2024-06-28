package org.javaguru.travel.insurance.core;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {

    public long calculateTimeInMillisBetweenTwoDays(Date dateFrom, Date dateTo) {
        return dateTo.getTime() - dateFrom.getTime();
    }

    public long convertTimeInMillisToDays(Long timeInMillis) {
        return TimeUnit.DAYS.convert(timeInMillis, TimeUnit.MILLISECONDS);
    }
}
