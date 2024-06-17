package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class TravelCalculatePremiumServiceImplAIOneTest {

  @Test
  void shouldCalculatePremiumCorrectly() {
    TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    Date agreementDateFrom = new Date();
    Date agreementDateTo = new Date(agreementDateFrom.getTime() + 86400000); // +1 day
    String firstName = "John";
    String lastName = "Doe";

    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(agreementDateFrom, agreementDateTo, firstName, lastName);
    TravelCalculatePremiumResponse response = service.calculatePremium(request);

    assertEquals(agreementDateFrom, response.getAgreementDateFrom());
    assertEquals(agreementDateFrom, response.getAgreementDateTo());
    assertEquals(firstName, response.getPersonFirstName());
    assertEquals(lastName, response.getPersonLastName());
  }
}
