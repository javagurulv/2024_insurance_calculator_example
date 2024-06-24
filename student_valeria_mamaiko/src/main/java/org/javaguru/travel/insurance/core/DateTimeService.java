package org.javaguru.travel.insurance.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeService {
    public static BigDecimal countAgreementPrice(LocalDate agreementDateFrom, LocalDate agreementDateTo){
        if((agreementDateFrom != null) && (agreementDateTo != null)){
            long fakeAgreementPrice = ChronoUnit.DAYS.between(agreementDateFrom, agreementDateTo);
            return new BigDecimal(fakeAgreementPrice);
        }
        else return null;
    }
}
