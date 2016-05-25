package com.cert.polymorphism;

/**
 * Created by sridhar on 4/4/16.
 */
public class Vet {

    public void giveShot(Animal a){
        System.out.print("ouch...");
        a.makeNoise();
    }
}
