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
    public void calculatePremiumFirstNameTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        String firstName = "valeria";
        request.setPersonLastName(firstName);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void calculatePremiumLastNameTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        String lastName = "mamaiko";
        request.setPersonLastName(lastName);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void calculatePremiumDateFromTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        Date agreementDateFrom = new Date(124, 5, 1);
        request.setAgreementDateFrom(agreementDateFrom);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void calculatePremiumDateToTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        Date agreementDateTo = new Date(124, 5, 20);
        request.setAgreementDateTo(agreementDateTo);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    /*@Test
    public void calculatePremiumTest() {
        String lastName = "mamaiko";
        String firstName = "valeria";
        Date agreementDateFrom = new Date(124, 5, 1);
        Date agreementDateTo = new Date(124, 5, 20);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                firstName, lastName, agreementDateFrom, agreementDateTo);
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse(
                firstName, lastName, agreementDateFrom, agreementDateTo);
        TravelCalculatePremiumResponse funcResponse = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response, funcResponse);
    }*/

    @Test
    public void dateQuestionTest() throws InterruptedException {
        Date agreementDateFrom = new Date();
        /*Thread.sleep(2000);*/
        Date agreementDateTo = new Date();
        Assertions.assertEquals(agreementDateFrom.getTime(), agreementDateTo.getTime());
    }

}