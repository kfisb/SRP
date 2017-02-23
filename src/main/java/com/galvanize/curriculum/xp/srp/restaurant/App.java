package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class App {

    public static void main(String[] args) {
        // example of usage:
        Item burger = new Item("Burger", 4, 2);
        Item macAndCheese = new Item("Mac and Cheese", 6, 1);
        Item sprite = new Item("Sprite", 1, 3);

        BigDecimal taxRate = new BigDecimal(.10);
        BigDecimal tipRate = new BigDecimal(.18);
        List<Item> foodItems = Arrays.asList(burger, macAndCheese, sprite);
        RestaurantBill bill = new RestaurantBill(foodItems, taxRate, tipRate);
        bill.printItemizedReceipt();
    }
}
