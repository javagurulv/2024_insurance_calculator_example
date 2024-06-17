package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TravlerCalculatePremiumServiceImplAIOneTest
{


    private TravelCalculatePremiumServiceImpl service;
    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;
    private Date testDate;

@BeforeEach
    public void CalculatePremium() {
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
        public void testAllProperties() {
            assertEquals("Ilya", response.getPersonFirstName(), "PersonFirstName не совпадает");
            assertEquals("Zhuk", response.getPersonLastName(), "PersonLastName не совпадает");
            assertEquals(testDate, response.getAgreementDateFrom(), "AgreementDateFrom не совпадает");
            assertEquals(testDate, response.getAgreementDateTo(), "AgreementDateTo не совпадает");
        }
    }

