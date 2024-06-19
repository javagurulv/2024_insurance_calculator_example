package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

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
        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());

    }

    @Test
    public void responseLastNameTest(){
        // дополняем запрос значением фамилии
        request.setPersonLastName("Seliv");

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());

    }

    @Test
    public void responseAgreementDateFromTest(){
        // дополняем запрос значением даты начала
        request.setAgreementDateFrom(new Date());

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void responseAgreementDateToTest(){
        // дополняем запрос значением даты конца
        request.setAgreementDateTo(new Date());

        // получаем ответ на основе нашего запроса
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // проверяем правильность заполнения
        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

}