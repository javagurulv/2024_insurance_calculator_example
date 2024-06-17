package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class TravelCalculatePremiumServiceImplAIEachFieldTest {

  private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

  @Test
  void shouldReturnCorrectAgreementDateFrom() {
    Date agreementDateFrom = new Date();
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(agreementDateFrom, new Date(), "John", "Doe");
    TravelCalculatePremiumResponse response = service.calculatePremium(request);
    assertEquals(agreementDateFrom, response.getAgreementDateFrom());
  }

  @Test
  void shouldReturnCorrectAgreementDateTo() {
    Date agreementDateTo = new Date();
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(new Date(), agreementDateTo, "John", "Doe");
    TravelCalculatePremiumResponse response = service.calculatePremium(request);
    assertEquals(request.getAgreementDateFrom(), response.getAgreementDateTo());
  }

  @Test
  void shouldReturnCorrectPersonFirstName() {
    String firstName = "John";
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(new Date(), new Date(), firstName, "Doe");
    TravelCalculatePremiumResponse response = service.calculatePremium(request);
    assertEquals(firstName, response.getPersonFirstName());
  }

  @Test
  void shouldReturnCorrectPersonLastName() {
    String lastName = "Doe";
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(new Date(), new Date(), "John", lastName);
    TravelCalculatePremiumResponse response = service.calculatePremium(request);
    assertEquals(lastName, response.getPersonLastName());
  }
}
