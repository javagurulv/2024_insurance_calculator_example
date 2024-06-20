package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Date;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;

    @BeforeAll
    public void initRequest() {
        Date agreementDateFrom = new Date(System.currentTimeMillis());
        Date agreementDateTo = new Date((long) (System.currentTimeMillis() * 1.2));
        request = new TravelCalculatePremiumRequest("FirstName", "LastName", agreementDateFrom, agreementDateTo);

        response = service.calculatePremium(request);
    }

    @Test
    public void personFirstNameFillingTest() {
        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void personLastNameFillingTest() {
        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void agreementDateFromFillingTest() {
        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void agreementDateToTest() {
        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }
}