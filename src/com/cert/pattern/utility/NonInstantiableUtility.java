package com.cert.pattern.utility;

/**
 * Created by sridhar on 4/4/16.
 */
public class NonInstantiableUtility {

    private NonInstantiableUtility(){
        throw new AssertionError();
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        //NonInstantiableUtility util = new NonInstantiableUtility();
        System.out.println("Add : " + NonInstantiableUtility.add(3, 4));
    }
}
