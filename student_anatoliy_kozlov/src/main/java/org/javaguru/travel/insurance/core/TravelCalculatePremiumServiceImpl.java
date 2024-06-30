package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    TravelCalculatePremiumServiceImpl() {}

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {

        BigDecimal Price = this.CountAgreementPrice(request.GetAgreementDateFrom(), request.GetAgreementDateTo());

        return new TravelCalculatePremiumResponse(
                request.GetFirstName(),
                request.GetLastName(),
                request.GetAgreementDateFrom(),
                request.GetAgreementDateTo(),
                Price
        );



    }

    public BigDecimal CountAgreementPrice(Date DateFrom, Date DateTo)
    {
        long diff = DateTo.getTime() - DateFrom.getTime();
        diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return new BigDecimal(diff);

    }
}
