package com.galvanize.curriculum.xp.srp.restaurant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void computeTotalWithTax() throws Exception {
        Calculator calculator = new Calculator(new BigDecimal(.10), new BigDecimal(.18));
        BigDecimal expectedOutput = new BigDecimal(1100).setScale(2, RoundingMode.HALF_DOWN);


        assertEquals(expectedOutput, calculator.computeTotalWithTax(new BigDecimal(1000)));
    }

    @Test
    public void computeTotalWithTip() throws Exception {
        Calculator calculator = new Calculator(new BigDecimal(.10), new BigDecimal(.18));
        BigDecimal expectedOutput = new BigDecimal(1180).setScale(2, RoundingMode.HALF_DOWN);


        assertEquals(expectedOutput, calculator.computeTotalWithTip(new BigDecimal(1000)));
    }

    @Test
    public void computeTotalWithTipandTax() throws Exception {
        Calculator calculator = new Calculator(new BigDecimal(.10), new BigDecimal(.18));
        BigDecimal expectedOutput = new BigDecimal(1280).setScale(2, RoundingMode.HALF_DOWN);


        assertEquals(expectedOutput, calculator.computeTotalWithTipAndTax(new BigDecimal(1000)));
    }


}
