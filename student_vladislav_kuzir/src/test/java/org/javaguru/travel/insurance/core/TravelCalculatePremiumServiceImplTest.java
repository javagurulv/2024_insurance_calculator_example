package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

  private TravelCalculatePremiumService travelCalculatePremiumService = new TravelCalculatePremiumServiceImpl();

  @Test
  public void responseTest() {
    TravelCalculatePremiumRequest travelCalculatePremiumRequest = new TravelCalculatePremiumRequest();
    travelCalculatePremiumRequest.setPersonFirstName("IsmailYue");
    travelCalculatePremiumRequest.setPersonLastName("Mohammad");
    travelCalculatePremiumRequest.setAgreementDateFrom(new Date());
    travelCalculatePremiumRequest.setAgreementDateTo(new Date());

    TravelCalculatePremiumResponse travelCalculatePremiumResponse = travelCalculatePremiumService
            .calculatePremium(travelCalculatePremiumRequest);

    Assertions.assertEquals(travelCalculatePremiumResponse.getPersonFirstName(), "IsmailYue");
    Assertions.assertEquals(travelCalculatePremiumResponse.getPersonLastName(), "Mohammad");
    Assertions.assertNotNull(travelCalculatePremiumResponse.getAgreementDateFrom());
    Assertions.assertNotNull(travelCalculatePremiumResponse.getAgreementDateTo());
  }


}