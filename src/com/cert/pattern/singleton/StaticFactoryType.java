package com.cert.pattern.singleton;

/**
 * Created by sridhar on 4/4/16.
 */
public class StaticFactoryType {
    private static final StaticFactoryType INSTANCE = new StaticFactoryType();

    private StaticFactoryType(){

    }
    public static StaticFactoryType getInstance(){
        return INSTANCE;
    }
    public void leaveTheBuilding(){}

}
