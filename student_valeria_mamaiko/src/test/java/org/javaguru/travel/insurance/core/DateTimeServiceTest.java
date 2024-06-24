package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeServiceTest {

    @Test
    public void correctResult(){
        LocalDate agreementDateFrom = LocalDate.of(2024, 6, 1);
        LocalDate agreementDateTo = LocalDate.now();
        BigDecimal result = DateTimeService.countAgreementPrice(agreementDateFrom, agreementDateTo);
        AdditionalTools.assertEquals(new BigDecimal(23), result, true);
    }

    @Test
    public void reverseDates(){
        LocalDate agreementDateTo = LocalDate.of(2024, 6, 1);
        LocalDate agreementDateFrom = LocalDate.now();
        BigDecimal result = DateTimeService.countAgreementPrice(agreementDateFrom, agreementDateTo);
        AdditionalTools.assertEquals(new BigDecimal(-23), result, true);
    }

    @Test
    public void notNullArgument(){
        LocalDate agreementDateFrom = LocalDate.of(2024, 6, 1);
        LocalDate agreementDateTo = LocalDate.now();
        BigDecimal result = DateTimeService.countAgreementPrice(agreementDateFrom, agreementDateTo);
        Assertions.assertNotNull(result);
    }

    @Test
    public void nullArgument(){
        LocalDate agreementDateFrom = null;
        LocalDate agreementDateTo = LocalDate.now();
        BigDecimal result = DateTimeService.countAgreementPrice(agreementDateFrom, agreementDateTo);
        Assertions.assertNull(result);
    }

}
