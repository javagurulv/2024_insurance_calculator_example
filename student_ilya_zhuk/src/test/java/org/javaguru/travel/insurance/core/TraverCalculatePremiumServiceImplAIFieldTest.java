package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TraverCalculatePremiumServiceImplAIFieldTest {

    private TravelCalculatePremiumServiceImpl service;
    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;
    private Date testDate;
@BeforeEach
    public void CalculatePremiumService() {
        service = new TravelCalculatePremiumServiceImpl();
        request = new TravelCalculatePremiumRequest();

        // Установим тестовые данные
        request.setPersonFirstName("Ilya");
        request.setPersonLastName("Zhuk");
        testDate = new Date();  // Создаем одно значение даты
        request.setAgreementDateFrom(testDate);
        request.setAgreementDateTo(testDate);

        // Выполним метод calculatePremium
        response = service.calculatePremium(request);
    }

    @Test
    public void testPersonFirstName() {
        assertEquals("Ilya", response.getPersonFirstName(), "PersonFirstName не совпадает");
    }

    @Test
    public void testPersonLastName() {
        assertEquals("Zhuk", response.getPersonLastName(), "PersonLastName не совпадает");
    }

    @Test
    public void testAgreementDateFrom() {
        assertEquals(testDate, response.getAgreementDateFrom(), "AgreementDateFrom не совпадает");
    }

    @Test
    public void testAgreementDateTo() {
        assertEquals(testDate, response.getAgreementDateTo(), "AgreementDateTo не совпадает");
    }
}

