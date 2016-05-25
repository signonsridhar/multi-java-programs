package com.cert.generics.extendsGift;

public class Main {

    public static void main(String[] args) {
        Parcel<Book> p = new Parcel<>();
        p.set(new Book());
        p.shipParcel();
    }
}
