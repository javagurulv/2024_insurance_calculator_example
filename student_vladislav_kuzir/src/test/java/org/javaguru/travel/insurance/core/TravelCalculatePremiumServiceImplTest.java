package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

  private static TravelCalculatePremiumResponse travelCalculatePremiumResponse;

  @BeforeAll
  static void setUp() {
    TravelCalculatePremiumService travelCalculatePremiumService =
            new TravelCalculatePremiumServiceImpl();
    TravelCalculatePremiumRequest travelCalculatePremiumRequest = new TravelCalculatePremiumRequest();
    travelCalculatePremiumRequest.setPersonFirstName("IsmailYue");
    travelCalculatePremiumRequest.setPersonLastName("Mohammad");
    travelCalculatePremiumRequest.setAgreementDateFrom(new Date());
    travelCalculatePremiumRequest.setAgreementDateTo(new Date());
    travelCalculatePremiumResponse = travelCalculatePremiumService.calculatePremium(travelCalculatePremiumRequest);

  }

  @Test
  void getFirstNameFromResponseTest() {
    Assertions.assertEquals(travelCalculatePremiumResponse.getPersonFirstName(), "IsmailYue");
  }

  @Test
  void getLastNameFromResponseTest() {
    Assertions.assertEquals(travelCalculatePremiumResponse.getPersonLastName(), "Mohammad");
  }

  @Test
  void getAgreementDateFromResponseTest() {
    Assertions.assertNotNull(travelCalculatePremiumResponse.getAgreementDateFrom());
  }

  @Test
  void getAgreementDateToResponseTest() {
    Assertions.assertNotNull(travelCalculatePremiumResponse.getAgreementDateTo());
  }

}