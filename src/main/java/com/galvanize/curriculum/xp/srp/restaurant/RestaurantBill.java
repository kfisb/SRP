package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class RestaurantBill {
    private List<Item> listOfItems;
    private BigDecimal taxRate;
    private BigDecimal tipRate;

    public RestaurantBill(List<Item> listOfItems, BigDecimal taxRate, BigDecimal tipRate) {
        this.listOfItems = listOfItems;
        this.taxRate = taxRate;
        this.tipRate = tipRate;
    }

    public BigDecimal computeSubTotal() {
        BigDecimal total = new BigDecimal(0);
        for (Item item : listOfItems) {
            total = total.add(item.getPrice().multiply(new BigDecimal(item.getQuantity()))).setScale(2, RoundingMode.HALF_DOWN);
        }
        return total;
    }

    BigDecimal computeTotalWithTax() {
        BigDecimal total = computeSubTotal();

        Calculator calculator = new Calculator(taxRate, tipRate);

        return calculator.computeTotalWithTax(total);
    }

    BigDecimal computeTotalWithTip() {
        BigDecimal total = computeSubTotal();

        Calculator calculator = new Calculator(taxRate, tipRate);
        return calculator.computeTotalWithTip(total);
    }

    BigDecimal computeTotalWithTaxAndTip() {
        BigDecimal total = computeSubTotal();
        Calculator calculator = new Calculator(taxRate, tipRate);
        return calculator.computeTotalWithTipAndTax(total);
    }



    void printItemizedReceipt() {
        String output = "";

        for (Item item : listOfItems) {
            output += item.getName() + "(" + item.getQuantity() + ") $" + item.getPrice().multiply(new BigDecimal(item.getQuantity())) + "\n";
        }

        output += "--------------------\n";
        output += "tax:          " + "$" + this.computeTotalWithTax() + "\n";
        output += "--------------------\n";
        output += "tip:          " + "$" + this.computeTotalWithTip() + "\n";
        output += "--------------------\n";
        output += "total:        " + "$" + this.computeTotalWithTaxAndTip() + "\n";
        System.out.println(output);
    }

}
