package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

  @Override
  public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
    return new TravelCalculatePremiumResponse(request.getAgreementDateFrom(),
            request.getAgreementDateTo(),
            getDaysBetweenAgreementDates(request.getAgreementDateFrom(), request.getAgreementDateTo()),
            request.getPersonFirstName(),
            request.getPersonLastName());
  }


  private BigDecimal getDaysBetweenAgreementDates(Date agreementDateFrom, Date agreementDateTo) {
    long daysBetween = Duration.between(agreementDateFrom.toInstant(), agreementDateTo.toInstant()).toDays();
    return new BigDecimal(daysBetween);
  }
}
