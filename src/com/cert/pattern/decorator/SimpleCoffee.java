package com.cert.pattern.decorator;

/**
 * Created by sridhar on 16/2/16.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee  ";
    }
}