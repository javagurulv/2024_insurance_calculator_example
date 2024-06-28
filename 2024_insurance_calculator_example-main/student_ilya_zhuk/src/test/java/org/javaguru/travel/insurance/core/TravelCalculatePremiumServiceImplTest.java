package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    @Test
    public void shouldPopulatePersonFirstName()
    {
        var request = TestRequestWithAllFields();
        var response = service.calculatePremium(request);
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void shouldPopulatePersonLastName()
    {
        var request = TestRequestWithAllFields();
        var response = service.calculatePremium(request);
        assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void shouldPopulateAgreementDateFrom()
    {
        var request = TestRequestWithAllFields();
        var response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void shouldPopulateAgreementDateTo()
    {
        var request = TestRequestWithAllFields();
        var response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    @Test
    public void shouldPopulateAgreementPrice()
    {
        var request = TestRequestWithAllFields();
        var response = service.calculatePremium(request);
        assertNotNull(response.getAgreementPrice());
    }

    private TravelCalculatePremiumRequest TestRequestWithAllFields()
    {
        var request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Ilya");
        request.setPersonLastName("Zhuk");
        request.setAgreementDateFrom(new Date());
        request.setAgreementDateTo(new Date());
        return request;
    }

}