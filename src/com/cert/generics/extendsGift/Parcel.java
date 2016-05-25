package com.cert.generics.extendsGift;

/**
 * Created by sridhar on 18/1/16.
 */
public class Parcel<T extends Gift> {
    private T t;

    public void set(T t){
        this.t = t;
    }

    public void shipParcel() {
        if (t.getWeight() > 20) {
            System.out.println("Ship by abc");
        } else {
            System.out.println("Ship by xyz");
        }
    }
}
