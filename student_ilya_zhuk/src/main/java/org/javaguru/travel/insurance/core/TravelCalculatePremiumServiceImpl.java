package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;


import java.math.BigDecimal;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

@Component
public class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        response.setAgreementPrice(request.getAgreementPrice());


        var DaysBetween = calculationPriceOnDays(request);
        response.setAgreementPrice(new BigDecimal(DaysBetween));


        return response;
    }

    public long calculationPriceOnDays(TravelCalculatePremiumRequest request) {
        long distance = request.getAgreementDateFrom().getTime() - request.getAgreementDateTo().getTime();
        return TimeUnit.DAYS.convert(distance, TimeUnit.MILLISECONDS);
    }
}
