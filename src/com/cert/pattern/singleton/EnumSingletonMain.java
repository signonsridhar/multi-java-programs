package com.cert.pattern.singleton;

/**
 * Created by sridhar on 4/4/16.
 */
public class EnumSingletonMain {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.leaveTheBuilding();
    }
}
