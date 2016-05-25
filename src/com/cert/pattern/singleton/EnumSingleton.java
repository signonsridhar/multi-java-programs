package com.cert.pattern.singleton;

/**
 * Created by sridhar on 4/4/16.
 */
public enum EnumSingleton {
    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("leaving the building");
    }
}
