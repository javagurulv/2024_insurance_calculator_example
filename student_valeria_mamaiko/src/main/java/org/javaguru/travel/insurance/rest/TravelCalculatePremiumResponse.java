package org.javaguru.travel.insurance.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TravelCalculatePremiumResponse {
    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;
    private BigDecimal agreementPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelCalculatePremiumResponse response = (TravelCalculatePremiumResponse) o;
        return Objects.equals(personFirstName, response.personFirstName)
                && Objects.equals(personLastName, response.personLastName)
                && Objects.equals(agreementDateFrom, response.agreementDateFrom)
                && Objects.equals(agreementDateTo, response.agreementDateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personFirstName, personLastName, agreementDateFrom, agreementDateTo);
    }
}
