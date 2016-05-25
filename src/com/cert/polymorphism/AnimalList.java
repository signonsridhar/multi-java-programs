package com.cert.polymorphism;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sridhar on 4/4/16.
 */
public class AnimalList {
    private ArrayList<Animal> list = new ArrayList<>();

    public void add(Animal a){
        list.add(a);
    }
    public void makeNoise(){
        for (Animal a: list){
            a.makeNoise();
        }
    }


    public static void main(String[] args) {
        AnimalList aList = new AnimalList();
        Animal cat = new Cat();
        Animal pig = new Pig();
        aList.add(cat);
        aList.add(pig);
        aList.makeNoise();
    }
}
