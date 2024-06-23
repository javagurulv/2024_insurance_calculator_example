package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    private final TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;

    @BeforeEach
    public void setup() {
        request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("John");
        request.setPersonLastName("Ivanov");
        request.setAgreementDateFrom(new Date(1719219600000L));
        request.setAgreementDateTo(new Date(1719306000000L));
        response = service.calculatePremium(request);
    }

    @Test
    public void testPersonalFirstName() {
        assertThat(response.getPersonFirstName()).isEqualTo(request.getPersonFirstName());
    }

    @Test
    public void testPersonalLastName() {
        assertThat(response.getPersonLastName()).isEqualTo(request.getPersonLastName());
    }

    @Test
    public void testAgreementDateFrom() {
        assertThat(response.getAgreementDateFrom()).isEqualTo(request.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateTo() {
        assertThat(response.getAgreementDateTo()).isEqualTo(request.getAgreementDateTo());
    }

    @Test
    public void testCalculatePremium() {
        assertThat(response.getPersonFirstName()).isEqualTo("John");
        assertThat(response.getPersonLastName()).isEqualTo("Ivanov");
        assertThat(response.getAgreementDateFrom()).isEqualTo("2024-06-24T12:00:00.000");
        assertThat(response.getAgreementDateTo()).isEqualTo("2024-06-25T12:00:00.000");
    }
}