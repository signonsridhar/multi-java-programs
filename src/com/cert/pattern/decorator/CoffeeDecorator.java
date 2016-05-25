package com.cert.pattern.decorator;

/**
 * Created by sridhar on 16/2/16.
 */
public abstract class CoffeeDecorator implements Coffee {
        protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public int getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients() ;
    }
}
