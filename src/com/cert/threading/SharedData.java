package com.cert.threading;

/**
 * Created by sridhar on 9/2/16.
 */
public class SharedData implements Runnable {
    private int sharedData ;

    public synchronized void accessData(){
        System.out.println("this thread " + this);
        sharedData++;
    }
    @Override
    public void run() {
        System.out.println("inside run method");
        accessData();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SharedData());
        thread1.start();
        Thread thread2 = new Thread(new SharedData());
        thread2.start();
    }
}
