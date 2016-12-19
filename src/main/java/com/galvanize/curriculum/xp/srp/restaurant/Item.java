package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;

class Item {
    private String name;
    private BigDecimal price;
    private int quantity;

    Item(String name, int price, int quantity) {
        this(name, new BigDecimal(price), quantity);
    }

    Item(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    BigDecimal getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }
}
