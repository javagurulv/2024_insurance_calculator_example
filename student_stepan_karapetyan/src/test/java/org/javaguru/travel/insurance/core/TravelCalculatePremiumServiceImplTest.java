package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void deleteMe() {

    }

    @Test
    public void calculatePremium() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("James",
                                                                                "LeBron",
                                                                                    new Date(),
                                                                                    new Date());
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(response.getPersonFirstName(), response.getPersonFirstName());
        assertEquals(response.getPersonLastName(), response.getPersonLastName());
        assertEquals(response.getAgreementDateFrom(), response.getAgreementDateFrom());
        assertEquals(response.getAgreementDateTo(), response.getAgreementDateTo());
    }
}