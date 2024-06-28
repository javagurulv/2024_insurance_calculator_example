package org.javaguru.travel.insurance.core;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Date;

public class DateTimeService {

  public BigDecimal getDaysBetweenAgreementDates(Date agreementDateFrom, Date agreementDateTo) {
    long daysBetween = Duration.between(agreementDateFrom.toInstant(), agreementDateTo.toInstant()).toDays();
    return new BigDecimal(daysBetween);
  }
}
