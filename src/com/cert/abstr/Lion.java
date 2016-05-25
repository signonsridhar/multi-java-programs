package com.cert.abstr;

/**
 * Created by sridhar on 10/1/16.
 */
public class Lion extends Animal {
    @Override
    public void move(String newPosition) {
        currentPosition = newPosition;
        System.out.println("move now " + newPosition);
    }

    public void changePosition(String newPosition){

    }

}
