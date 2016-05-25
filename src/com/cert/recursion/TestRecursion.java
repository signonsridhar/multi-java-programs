package com.cert.recursion;

/**
 * Created by sridhar on 12/4/16.
 */
public class TestRecursion {
    public static void main(String[] args) {
        myRecursiveMethod(10);

        //fibonacci
        int n1= 0 , n2 = 1;
        tenthfibonacciSequence(n1, n2);

        //factorial
        factorial(10);
    }
    // factorial of a number
    /*
    factorial(5)
       factorial(4)
          factorial(3)
             factorial(2)
                factorial(1)
                   return 1
                return 2*1 = 2
             return 3*2 = 6
          return 4*6 = 24
       return 5*24 = 120

     */
    public static int factorial(int n){
        if (n==1)
            return 1;
        return n * factorial(n-1);
    }

    //fibonacci numbers
    private static int stoppingPoint = 10;
    private static int index = 0;
    public static void tenthfibonacciSequence(int n1, int n2){
        System.out.println("index: " + index +" -> " + n1);

        if (index == stoppingPoint)
            return;

        index++;

        tenthfibonacciSequence(n2, n1+n2);

    }


    private static int myRecursiveMethod (int aVariable)
    {
        System.out.println(aVariable);
        aVariable--;
        if (aVariable == 0)
            return 0;
        return myRecursiveMethod(aVariable);
    }


}
