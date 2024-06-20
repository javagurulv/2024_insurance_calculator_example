package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import java.util.Date;

class TravelCalculatePremiumServiceImplTest {
    private final TravelCalculatePremiumServiceImpl calculatePremiumService;

    TravelCalculatePremiumServiceImplTest() {
        calculatePremiumService = new TravelCalculatePremiumServiceImpl();
    }

    @Test
    public void calculatePremiumTest() {
        String lastName = "mamaiko";
        String firstName = "valeria";
        Date agreementDateFrom = new Date(2024, 6, 1);
        Date agreementDateTo = new Date(2024, 6, 20);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                firstName, lastName, agreementDateFrom, agreementDateTo);
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse(
                firstName, lastName, agreementDateFrom, agreementDateTo);
        TravelCalculatePremiumResponse funcResponse = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response, funcResponse);
    }

}