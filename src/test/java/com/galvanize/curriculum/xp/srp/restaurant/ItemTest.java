package com.galvanize.curriculum.xp.srp.restaurant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ItemTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void item_Initalize() throws Exception {
        BigDecimal bd = new BigDecimal(5);
        Item item = new Item("Big Mac", 5, 100);

        assertEquals("Big Mac", item.getName());
        assertEquals(bd, item.getPrice());
        assertEquals(100, item.getQuantity());
    }

}