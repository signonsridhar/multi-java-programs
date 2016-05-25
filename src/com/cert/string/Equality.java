package com.cert.string;

import java.util.Objects;

/**
 * Created by sridhar on 12/4/16.
 */
public class Equality {
    public static void runTest1() {
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("Returned Value = " + retVal);

        retVal = Str1.equals( Str3 );
        System.out.println("Returned Value = " + retVal);

        System.out.println(Str1 == Str3); //false

        // These two have the same value
        System.out.println(new String("test").equals("test")); // --> true

        // ... but they are not the same object
        System.out.println(new String("test") == "test"); // --> false

        // ... neither are these
        System.out.println(new String("test") == new String("test")); // --> false

// ... but these are because literals are interned by
// the compiler and thus refer to the same object
        System.out.println("test" == "test"); // --> true

// ... but you should really just call Objects.equals()
        System.out.println(Objects.equals("test", new String("test"))); // --> true
        System.out.println(Objects.equals(null, "test")); // --> false


    }

    public static void main(String[] args) {
        Equality.runTest1();
    }
}
