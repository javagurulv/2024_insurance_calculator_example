package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TravelCalculatePremiumServiceImplTest {
    private TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());

        return response;
    }

    @Test
    public void test1() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Boba",
                "Bibin", new Date(2024, 1, 1), new Date(2024, 12, 31));

        TravelCalculatePremiumResponse response = calculatePremium(request);

        assertEquals("Boba", response.getPersonFirstName());
        assertEquals("Bibin", response.getPersonLastName());
        assertEquals(new Date(2024, 1, 1), response.getAgreementDateFrom());
        assertEquals(new Date(2024, 12, 31), response.getAgreementDateTo());
    }

    @Test
    public void test2() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Boba",
                "Bibin", new Date(2024, 1, 1), new Date(2024, 12, 31));

        TravelCalculatePremiumResponse response = calculatePremium(request);

        assertNotEquals("Gigi", response.getPersonFirstName());
        assertNotEquals("ZaShagi", response.getPersonLastName());
        assertNotEquals(new Date(2022, 1, 1), response.getAgreementDateFrom());
        assertNotEquals(new Date(3024, 12, 31), response.getAgreementDateTo());
    }

}