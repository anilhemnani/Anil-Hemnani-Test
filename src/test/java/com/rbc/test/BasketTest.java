package com.rbc.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anilhemnani on 15/05/2016.
 */
public class BasketTest {

    @Test
    public void testSingleItemBasket() {
        Basket basket = new Basket();
        basket.addItem(Item.APPLE, 1);
        Assert.assertTrue(Item.APPLE.getPrice() == basket.getTotalCost());
    }

    @Test
    public void testOneItem2QuantityBasket() {
        Basket basket = new Basket();
        basket.addItem(Item.APPLE, 2);
        Assert.assertTrue(Item.APPLE.getPrice() * 2 == basket.getTotalCost());
    }


    @Test
    public void multiItemSingleQuantityBasket() {
        Basket basket = new Basket();
        double price = 0;
        for (Item item : Item.values()) {
            basket.addItem(item);
            price = price + item.getPrice();
        }
        Assert.assertTrue(price == basket.getTotalCost());
    }

    @Test
    public void randomMixItemBasketTest() {
        Basket basket = new Basket();
        basket.addItem(Item.APPLE); //single apple price 0.65
        basket.addItem(Item.ORANGE, 3); //each price .70 = 2.10
        basket.addItem(Item.BANANA, 12); //each price .30 = 3.60
        double totalCost = basket.getTotalCost();
        Assert.assertTrue(totalCost == 6.35);

    }
}
