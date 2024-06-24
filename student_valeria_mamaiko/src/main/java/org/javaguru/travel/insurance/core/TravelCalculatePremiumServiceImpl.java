package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        if((request.getAgreementDateFrom() != null) && (request.getAgreementDateTo() != null))
            response.setAgreementPrice(countAgreementPrice(request.getAgreementDateFrom(), request.getAgreementDateTo()));
        return response;
    }

    public static BigDecimal countAgreementPrice(LocalDate agreementDateFrom, LocalDate agreementDateTo){
        long fakeAgreementPrice = ChronoUnit.DAYS.between(agreementDateFrom, agreementDateTo);
        return new BigDecimal(fakeAgreementPrice);
    }

}
