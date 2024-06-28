package org.javaguru.travel.insurance.rest;

import java.util.Date;

public class TravelCalculatePremiumRequest {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    // Constructors

    public TravelCalculatePremiumRequest() {}

    public TravelCalculatePremiumRequest(
            String personFirstName,
            String personLastName,
            Date agreementDateFrom,
            Date agreementDateTo
    )
    {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    ///////

    // Getters and Setters

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

}
