package com.rbc.test;

/**
 * Created by anilhemnani on 15/05/2016.
 */
public enum Item {
    LEMON("Lemon", 0.20),
    PEACH("Peach", 0.45),
    BANANA("Banana", 0.30),
    ORANGE("Orange", 0.70),
    APPLE("Apple", 0.65);

    private String item;
    private double price;

    Item(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}
