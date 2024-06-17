package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelCalculatePremiumServiceImplTest {

    private static TravelCalculatePremiumServiceImpl service;

    @BeforeAll
    public static void setUp() {
        service = new TravelCalculatePremiumServiceImpl();
    }

    @Test
    public void testCalculatePremium() {
        // Подготовка тестовых данных
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Ilya");
        request.setPersonLastName("Zhuk");
        request.setAgreementDateFrom(new Date());
        request.setAgreementDateTo(new Date());

        // Выполнение тестируемого метода
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Проверка результатов
        assertEquals("Ilya", response.getPersonFirstName());
        assertEquals("Zhuk", response.getPersonLastName());
        assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }
}


