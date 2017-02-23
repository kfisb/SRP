package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private BigDecimal taxRate;
    private BigDecimal tipRate;

    public Calculator(BigDecimal taxRate, BigDecimal tipRate) {
        this.taxRate = taxRate;
        this.tipRate = tipRate;
    }

    public BigDecimal computeTotalWithTax(BigDecimal subTotal) {
        return subTotal.add(subTotal.multiply(taxRate)).setScale(2, RoundingMode.HALF_DOWN);
    }


    public BigDecimal computeTotalWithTip(BigDecimal subTotal) {
        return subTotal.add(subTotal.multiply(tipRate)).setScale(2, RoundingMode.HALF_DOWN);
    }

    public BigDecimal computeTotalWithTipAndTax(BigDecimal subtotal) {
        return subtotal.add(subtotal.multiply(taxRate).add(subtotal.multiply(tipRate))).setScale(2, RoundingMode.HALF_DOWN);
    }
}
