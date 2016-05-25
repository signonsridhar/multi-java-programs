package com.cert.polymorphism;

import com.cert.abstr.*;

/**
 * Created by sridhar on 4/4/16.
 */
public class Cat extends com.cert.polymorphism.Animal {

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("meow...yummy");
    }

    public void extraMethod(){
        System.out.println("cat's own extra method");
    }
}
