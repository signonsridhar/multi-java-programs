package com.cert.pattern.decorator;

/**
 * Created by sridhar on 16/2/16.
 */
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }


}
