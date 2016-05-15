package com.rbc.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anilhemnani on 15/05/2016.
 */
public class Basket {
    private Map<Item, Integer> items = new HashMap<Item, Integer>();

    public void addItem(Item item, Integer quantity) {
        //Item has got equals method overriden based on itemId so this should work
        if (items.containsKey(item)) {
            Integer existingQuantity = items.get(item);
            items.put(item, existingQuantity + quantity);
        } else {
            items.put(item, quantity);
        }
    }

    public void addItem(Item item) {
        addItem(item, 1);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items.keySet()) {
            Integer quantity = items.get(item);
            double itemCost = item.getPrice() * quantity;
            totalCost += itemCost;
        }
        return totalCost;
    }

}
