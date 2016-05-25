package com.cert.polymorphism;

/**
 * Created by sridhar on 4/4/16.
 */

public class Pig extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("oink");
    }

    @Override
    public void eat() {
        System.out.println("oink..yummy");
    }
}
