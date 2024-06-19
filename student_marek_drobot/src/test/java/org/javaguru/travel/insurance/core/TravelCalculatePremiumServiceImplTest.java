package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    private TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();

    @Test
    public void responseFirstNameTest(){
        // заполняем поле имени
        request.setPersonFirstName("Marina");

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());

    }

    @Test
    public void responseLastNameTest(){
        // дополняем запрос значением фамилии
        request.setPersonLastName("Seliv");

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        assertEquals(response.getPersonLastName(), request.getPersonLastName());

    }

    @Test
    public void responseAgreementDateFromTest(){
        // дополняем запрос значением даты начала
        request.setAgreementDateFrom(new Date());

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void responseAgreementDateToTest(){
        // дополняем запрос значением даты конца
        request.setAgreementDateTo(new Date());

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    // AI tests

    @Test
    public void TravelCalculatePremiumServiceImplAIOneTest() {
        // Given
        Date agreementDateFrom = new Date();
        Date agreementDateTo = new Date(System.currentTimeMillis() + 7*24*60*60*1000); // Adding 7 days in milliseconds
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("John", "Doe", agreementDateFrom, agreementDateTo);

        // When
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Then
        assertEquals("John", response.getPersonFirstName());
        assertEquals("Doe", response.getPersonLastName());
        assertEquals(agreementDateFrom, response.getAgreementDateFrom());
        assertEquals(agreementDateTo, response.getAgreementDateTo());
    }

    @Test
    public void TravelCalculatePremiumServiceImplAIFirstNameFieldTest() {
        // Given
        Date agreementDateFrom = new Date();
        Date agreementDateTo = new Date(System.currentTimeMillis() + 7*24*60*60*1000); // Adding 7 days in milliseconds
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Jane", "Doe", agreementDateFrom, agreementDateTo);

        // When
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Then
        assertEquals("Jane", response.getPersonFirstName());
    }

    @Test
    public void TravelCalculatePremiumServiceImplAILastNameFieldTest() {
        // Given
        Date agreementDateFrom = new Date();
        Date agreementDateTo = new Date(System.currentTimeMillis() + 7*24*60*60*1000); // Adding 7 days in milliseconds
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("John", "Smith", agreementDateFrom, agreementDateTo);

        // When
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Then
        assertEquals("Smith", response.getPersonLastName());
    }

    @Test
    public void TravelCalculatePremiumServiceImplAIAgreementDatesFieldTest() {
        // Given
        Date agreementDateFrom = new Date();
        Date agreementDateTo = new Date(System.currentTimeMillis() + 7*24*60*60*1000); // Adding 7 days in milliseconds
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("John", "Doe", agreementDateFrom, agreementDateTo);

        // When
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Then
        assertEquals(agreementDateFrom, response.getAgreementDateFrom());
        assertEquals(agreementDateTo, response.getAgreementDateTo());
    }

}