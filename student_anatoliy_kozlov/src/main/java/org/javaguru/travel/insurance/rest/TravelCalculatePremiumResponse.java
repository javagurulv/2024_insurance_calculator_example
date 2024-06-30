package org.javaguru.travel.insurance.rest;

import java.math.BigDecimal;
import java.time.temporal.Temporal;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;
    private BigDecimal agreementPrice;

    public TravelCalculatePremiumResponse() {}

    public TravelCalculatePremiumResponse(
            String personFirstName,
            String personLastName,
            Date agreementDateFrom,
            Date agreementDateTo,
            BigDecimal agreementPrice
    )
    {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
        this.agreementPrice = agreementPrice;
    }

    ///////

    // Getters and Setters

    //public

    public String GetFirstName()
    {
        return personFirstName;
    }

    public void SetFirstName(String FirstName)
    {
        this.personFirstName = FirstName;
    }

    public String GetLastName()
    {
        return personLastName;
    }

    public void SetLastName(String LastName)
    {
        this.personLastName = LastName;
    }

    public Date GetAgreementDateFrom()
    {
        return agreementDateFrom;
    }

    public void SetAgreementDateFrom(Date AgreementDateFrom)
    {
        this.agreementDateFrom = AgreementDateFrom;
    }

    public Date GetAgreementDateTo()
    {
        return agreementDateTo;
    }

    public void SetAgreementDateTo(Date AgreementDateTo)
    {
        this.agreementDateTo = AgreementDateTo;
    }

    public BigDecimal GetAgreementPrice()
    {
        return agreementPrice;
    }

    public void SetAgreementPrice(BigDecimal Price)
    {
        this.agreementPrice = Price;
    }

}
