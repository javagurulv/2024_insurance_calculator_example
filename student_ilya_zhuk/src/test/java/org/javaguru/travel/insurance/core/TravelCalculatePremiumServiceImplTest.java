package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TravelCalculatePremiumServiceImplTest
{
    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    private TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
    private TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
    private  Date testDate;

@BeforeEach
    public void CalculatePremium()
{
        testDate = new Date();
        service = new TravelCalculatePremiumServiceImpl();
        request = new TravelCalculatePremiumRequest();
        response = new TravelCalculatePremiumResponse();

        request.setPersonFirstName("Ilya");
        request.setPersonLastName("Zhuk");
        request.setAgreementDateFrom(testDate);
        request.setAgreementDateTo(testDate);

        response = service.calculatePremium(request);
    }

    @Test
    public  void TestSetPersonFirstName()
    {
        assertEquals("Ilya", response.getPersonFirstName());
    }

    @Test
    public void TestSetPersonLastName()
    {
        assertEquals("Zhuk", response.getPersonLastName());
    }

    @Test
    public void TestSetAgreementDateFrom()
    {
        assertEquals(testDate, response.getAgreementDateFrom());
    }

    @Test
    public void TestSetAgreementDateTo()
    {
        assertEquals(testDate, response.getAgreementDateTo());
    }



    //    public void CalculatePremium() {
//        TravelCalculatePremiumRequest request =
//                new TravelCalculatePremiumRequest();
//        request.setPersonFirstName("Ilya");
//        request.setPersonLastName("Zhuk");
//        request.setAgreementDateFrom(new Date());
//        request.setAgreementDateTo(new Date());

//        TravelCalculatePremiumResponse response = service.calculatePremium(request);

//        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
//        assertEquals(response.getPersonLastName(), request.getPersonLastName());
//        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
//        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
}



