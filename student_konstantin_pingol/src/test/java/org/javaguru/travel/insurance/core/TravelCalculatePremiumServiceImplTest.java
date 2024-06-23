package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    private final TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    @Test
    public void testCalculatePremium() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("John");
        request.setPersonLastName("Ivanov");
        request.setAgreementDateFrom(new Date(1719219600000L));
        request.setAgreementDateTo(new Date(1719306000000L));

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertThat(response.getPersonFirstName()).isEqualTo(request.getPersonFirstName());
        assertThat(response.getPersonLastName()).isEqualTo(request.getPersonLastName());
        assertThat(response.getAgreementDateFrom()).isEqualTo(request.getAgreementDateFrom());
        assertThat(response.getAgreementDateTo()).isEqualTo(request.getAgreementDateTo());
    }
}