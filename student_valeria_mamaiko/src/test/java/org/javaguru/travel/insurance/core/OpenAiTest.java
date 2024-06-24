/*
package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

@ExtendWith(MockitoExtension.class)
public class OpenAiTest {
    @InjectMocks
    private TravelCalculatePremiumServiceImpl travelCalculatePremiumService;

    @Test
    void testPersonFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("John");
        TravelCalculatePremiumResponse response = travelCalculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    void testPersonLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Doe");
        TravelCalculatePremiumResponse response = travelCalculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    void testAgreementDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateFrom(new Date(2023, 6, 1));
        TravelCalculatePremiumResponse response = travelCalculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    void testAgreementDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateTo(new Date(2023, 6, 10));
        TravelCalculatePremiumResponse response = travelCalculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }
}
*/
