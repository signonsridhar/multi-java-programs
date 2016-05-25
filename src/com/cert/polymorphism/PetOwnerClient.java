package com.cert.polymorphism;

/**
 * Created by sridhar on 4/4/16.
 */
public class PetOwnerClient {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Cat cat = new Cat();
        Animal pig = new Pig();
        vet.giveShot(cat);
        vet.giveShot(pig);

        cat.eat();
        cat.extraMethod();
        pig.eat();

    }
}