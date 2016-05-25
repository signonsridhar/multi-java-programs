package com.cert.threading;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

/**
 * Created by sridhar on 19/2/16.
 */
public class SynchronizedCounter {
    private int counter=0;

    public synchronized   int getCount(){
        return counter;
    }

    public synchronized void incrementCount(){
        counter++;
    }

    public  synchronized  void decrementCount(){
        counter--;
    }
}
class TestCounter{
    public static void main(String[] args) throws InterruptedException {
        final SynchronizedCounter syncCount = new SynchronizedCounter();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //incrementCount();
                for (int i=0;i < 1000; i++){
                    syncCount.incrementCount();
                    System.out.println("Thread " + Thread.currentThread().getName() + " " + syncCount.getCount());


                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println("count: " + syncCount.getCount());
    }
}

