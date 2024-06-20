package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void calculatePremiumFillingTest() {
        Date agreementDateFrom = new Date(System.currentTimeMillis());
        Date agreementDateTo = new Date((long) (System.currentTimeMillis() * 1.2));
        TravelCalculatePremiumRequest request =
                new TravelCalculatePremiumRequest("FirstName", "LastName", agreementDateFrom, agreementDateTo);

        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertThat(response).usingRecursiveComparison().isEqualTo(response);
    }
}