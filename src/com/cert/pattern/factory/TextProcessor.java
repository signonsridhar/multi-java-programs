package com.cert.pattern.factory;

/**
 * Created by sridhar on 9/5/16.
 */
public class TextProcessor implements App{

    @Override
    public void open(String fileName) {
        System.out.println("Open word document");
    }
}
