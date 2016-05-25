package com.cert.pattern.factory.simplefactory;

import com.cert.pattern.factory.App;

/**
 * Created by sridhar on 9/5/16.
 */
public class Client {
    public static void main(String[] args) {
        App app1 =  AppFactory.getInstance(".doc");
        app1.open("raja.doc");
        App app2 = AppFactory.getInstance(".txt");
        app2.open("shame.txt");
    }
}
