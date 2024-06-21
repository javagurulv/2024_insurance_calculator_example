package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    @Test
    public void personFirstNameFillingTest() {
        TravelCalculatePremiumRequest request = createTravelCalculatePremiumRequest();

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void personLastNameFillingTest() {
        TravelCalculatePremiumRequest request = createTravelCalculatePremiumRequest();

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void agreementDateFromFillingTest() {
        TravelCalculatePremiumRequest request = createTravelCalculatePremiumRequest();

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void agreementDateToTest() {
        TravelCalculatePremiumRequest request = createTravelCalculatePremiumRequest();

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    @Test
    public void agreementPriceTest() {
        TravelCalculatePremiumRequest request = createTravelCalculatePremiumRequest();
        long diffMillis = request.getAgreementDateTo().getTime() - request.getAgreementDateFrom().getTime();
        long diffDays = TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS);
        BigDecimal expectedAgreementPrice = new BigDecimal(diffDays);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementPrice(), expectedAgreementPrice);
    }

    private TravelCalculatePremiumRequest createTravelCalculatePremiumRequest() {
        return new TravelCalculatePremiumRequest("FirstName", "LastName", new Date(), new Date());
    }
}