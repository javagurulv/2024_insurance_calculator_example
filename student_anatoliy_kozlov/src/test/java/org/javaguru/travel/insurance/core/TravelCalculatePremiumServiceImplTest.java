package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    @Test
    public void CorrectFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.SetFirstName("John");
        request.SetAgreementDateFrom(new Date());
        request.SetAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.GetFirstName(), request.GetFirstName());
    }

    @Test
    public void CorrectLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.SetLastName("Tolkien");
        request.SetAgreementDateFrom(new Date());
        request.SetAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.GetLastName(), request.GetLastName());
    }

    @Test
    public void CorrectAgreementDateFrom()
    {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.SetAgreementDateFrom(new Date());
        request.SetAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.GetAgreementDateFrom(), request.GetAgreementDateFrom());
    }

    @Test
    public void CorrectAgreementDateTo()
    {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.SetAgreementDateFrom(new Date());
        request.SetAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.GetAgreementDateTo(), request.GetAgreementDateTo());
    }



}