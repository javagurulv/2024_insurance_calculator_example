package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;


public class DateTimeServiceTest {
  private DateTimeService dateTimeService = new DateTimeService();

  @Test
  void testGetDaysBetweenDates() {
    Date firstDate = new Date(2006, 1, 10);
    Date secondDate = new Date(2006, 1, 20);
    BigDecimal daysBetweenDates = dateTimeService.getDaysBetweenAgreementDates(firstDate, secondDate);
    Assertions.assertEquals(daysBetweenDates, BigDecimal.valueOf(10));
  }

  @Test
  void testGetDaysBetweenDatesInOneTime() {
    Date firstDate = new Date(2006, 1, 0);
    Date secondDate = new Date(2006, 1, 0);
    BigDecimal daysBetweenDates = dateTimeService.getDaysBetweenAgreementDates(firstDate, secondDate);
    Assertions.assertEquals(daysBetweenDates, BigDecimal.valueOf(0));
  }
}
