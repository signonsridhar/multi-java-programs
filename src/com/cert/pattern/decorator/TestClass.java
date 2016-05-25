package com.cert.pattern.decorator;

/**
 * Created by sridhar on 16/2/16.
 */
public class TestClass {
    public static void printInfo(Coffee c){
        System.out.println("Coffee " + c.getPrice() + " , ingredients :" + c.getIngredients());
    }
    public static void main(String[] args) {
        Coffee c  = new SimpleCoffee() ;
        printInfo(c);
        c = new WithChoco( new WithMilk(c));
        printInfo(c);

    }
}
