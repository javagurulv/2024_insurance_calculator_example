package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
        LocalDate agreementDateFrom = LocalDate.now();
        request.setAgreementDateFrom(agreementDateFrom);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void calculatePremiumDateToTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        LocalDate agreementDateTo = LocalDate.now();
        request.setAgreementDateTo(agreementDateTo);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    public static void assertEquals(BigDecimal expected, BigDecimal actual, boolean precisionMatters) {
        if (precisionMatters) {
            Assertions.assertEquals(expected, actual);
        } else {
            Assertions.assertEquals(0, expected.compareTo(actual));
        }
    }
    @Test
    public void calculateAgreementPriceTest(){
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        LocalDate agreementDateFrom = LocalDate.of(2024, 6, 1);
        LocalDate agreementDateTo = LocalDate.now();
        request.setAgreementDateFrom(agreementDateFrom);
        request.setAgreementDateTo(agreementDateTo);
        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
        BigDecimal agreementPrice = new BigDecimal(ChronoUnit.DAYS.between(agreementDateFrom, agreementDateTo));
        System.out.println(response.getAgreementPrice());
        assertEquals(response.getAgreementPrice(), agreementPrice, true);
    }

}
