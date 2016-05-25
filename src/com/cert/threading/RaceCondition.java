package com.cert.threading;

/**
 * Created by sridhar on 19/2/16.
 */
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new UnsafeSequence();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class UnsafeSequence implements Runnable{
    private int value;

    /** Returns a unique value. */
    public int getNext() {
        return value++;
    }

    @Override
    public void run() {
        int v;
        for (int i=0;i<10;i++){
            v = getNext();
            System.out.println("retrieved " + v);
        }
    }
}
