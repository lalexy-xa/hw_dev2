package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }
    @Test
    public void testThatSumWithOneWorksCorrect() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    public void testThatSumWithSixWorksCorrect() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    public void testThatSumWithZeroThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
