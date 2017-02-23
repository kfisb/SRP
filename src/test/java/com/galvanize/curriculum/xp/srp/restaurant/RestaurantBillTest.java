package com.galvanize.curriculum.xp.srp.restaurant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 2/23/17.
 */
public class RestaurantBillTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void computeTotalWithTax() throws Exception {
        Item item1 = new Item("Grand Mac", 6, 100);
        Item item2 = new Item("Mini Mac", 4, 100);
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.add(item1);
        listOfItems.add(item2);
        BigDecimal taxRate = new BigDecimal(.10);
        BigDecimal tipRate = new BigDecimal(.18);
        RestaurantBill restaurantBill = new RestaurantBill(listOfItems, taxRate, tipRate);

        BigDecimal expectedOutput = new BigDecimal(1100).setScale(2, RoundingMode.HALF_DOWN);

        assertEquals(expectedOutput, restaurantBill.computeTotalWithTax());
    }

    @Test
    public void computeTotalWithTip() throws Exception {
        Item item1 = new Item("Grand Mac", 6, 100);
        Item item2 = new Item("Mini Mac", 4, 100);
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.add(item1);
        listOfItems.add(item2);
        BigDecimal taxRate = new BigDecimal(.10);
        BigDecimal tipRate = new BigDecimal(.18);
        RestaurantBill restaurantBill = new RestaurantBill(listOfItems, taxRate, tipRate);

        BigDecimal expectedOutput = new BigDecimal(1180).setScale(2, RoundingMode.HALF_DOWN);

        assertEquals(expectedOutput, restaurantBill.computeTotalWithTip());
    }

    @Test
    public void computeTotalWithTaxAndTip() throws Exception {
        Item item1 = new Item("Grand Mac", 6, 100);
        Item item2 = new Item("Mini Mac", 4, 100);
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.add(item1);
        listOfItems.add(item2);
        BigDecimal taxRate = new BigDecimal(.10);
        BigDecimal tipRate = new BigDecimal(.18);
        RestaurantBill restaurantBill = new RestaurantBill(listOfItems, taxRate, tipRate);

        BigDecimal expectedOutput = new BigDecimal(1280).setScale(2, RoundingMode.HALF_DOWN);

        assertEquals(expectedOutput, restaurantBill.computeTotalWithTaxAndTip());
    }

    @Test
    public void computeSubTotal() throws Exception {
        Item item1 = new Item("Grand Mac", 6, 100);
        Item item2 = new Item("Mini Mac", 4, 100);
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.add(item1);
        listOfItems.add(item2);
        BigDecimal taxRate = new BigDecimal(.10);
        BigDecimal tipRate = new BigDecimal(.18);
        RestaurantBill restaurantBill = new RestaurantBill(listOfItems, taxRate, tipRate);

        BigDecimal expectedOutput = new BigDecimal(1000).setScale(2, RoundingMode.HALF_DOWN);

        assertEquals(expectedOutput, restaurantBill.computeSubTotal());
    }

}