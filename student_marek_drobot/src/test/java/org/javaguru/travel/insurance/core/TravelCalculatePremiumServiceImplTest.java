package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    @Test
    public void responseTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Marina");
        request.setPersonLastName("Seliv");
        request.setAgreementDateFrom(new Date());
        request.setAgreementDateTo(new Date());

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

}