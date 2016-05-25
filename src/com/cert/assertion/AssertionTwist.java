package com.cert.assertion;

/**
 * Created by sridhar on 5/2/16.
 */
public class AssertionTwist {
    public static void main(String args[]) {
        evenOdd(-11);
    }
    static void evenOdd(int num) {
        if (num%2 == 0)
            System.out.println("Even");
        else if (num%2 == 1)
            System.out.println("Odd");
        else {
            System.out.println("This should never be printed");
            assert false : new Person();
        }
    }
}

class Person{
    public String toString () {
        return "Pirates of the Caribbean";
    }
}
