package com.cert.pattern.decorator;

/**
 * Created by sridhar on 16/2/16.
 */
public class WithChoco extends CoffeeDecorator {

    public WithChoco(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Choco";
    }


}
