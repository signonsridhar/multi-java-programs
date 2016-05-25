package com.cert.threading;

/**
 * Created by sridhar on 20/1/16.
 */
public class SingAndDance {
    public static void main(String args[]) {
        Thread sing = new Sing();
        //sing.start();
        Thread newThread = new Thread(sing);
        newThread.start();
        newThread.yield();
    }
}
class Sing extends Thread{
    public void run() {
        yield();
        System.out.println("Singing " + this);

    }
}