package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class AdditionalTools {
    public static void assertEquals(BigDecimal expected, BigDecimal actual, boolean precisionMatters) {
        if (precisionMatters) {
            Assertions.assertEquals(expected, actual);
        } else {
            Assertions.assertEquals(0, expected.compareTo(actual));
        }
    }
}
