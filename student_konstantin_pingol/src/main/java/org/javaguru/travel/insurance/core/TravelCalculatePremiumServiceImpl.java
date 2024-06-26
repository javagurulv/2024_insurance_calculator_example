package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        response.setAgreementPrice(new BigDecimal(convertTimeInMillisToDays(calculateTimeInMillisBetweenAgreementDays(request))));
        return response;
    }

    private long calculateTimeInMillisBetweenAgreementDays(TravelCalculatePremiumRequest request) {
        return request.getAgreementDateTo().getTime() - request.getAgreementDateFrom().getTime();
    }

    private long convertTimeInMillisToDays(Long timeInMillis) {
        return TimeUnit.DAYS.convert(timeInMillis, TimeUnit.MILLISECONDS);
    }
}
