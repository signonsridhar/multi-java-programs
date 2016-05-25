package com.cert.threading.ProducerConsumerDrop;

import java.util.Random;

/**
 * Created by sridhar on 6/3/16.
 */
public class Drop {
    public synchronized String take() {
        while (empty)  {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = true;

        notifyAll();
        System.out.println("consumer taken " + message);
        return message;
    }

    public synchronized void put(String message) {
        while(!empty){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = false;
        this.message = message;
        System.out.println("Added " + message);
        notifyAll();
    }

    private String message;
    private boolean empty = true;

}

class Producer implements Runnable{
    Drop drop;

    public Producer(Drop drop){
        this.drop = drop;
    }
    @Override
    public void run() {
        String importantInfo[] = new String[]{
                "hello world",
                "hello world 2",
                "hello world 3"
        };
        Random rand = new Random();
        for (int i = 0; i < importantInfo.length ; i++) {

            drop.put(importantInfo[i]);

            try {
                Thread.sleep(rand.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        drop.put("DONE");


    }
}

class Consumer implements Runnable{
    Drop drop;
    public Consumer(Drop drop)
    {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (String message = drop.take(); !message.equals("DONE"); message = drop.take()) {
            try {
                Thread.sleep(rand.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class Test {
    public static void main(String[] args) {
        Drop drop = new Drop();
        Producer p = new Producer(drop);
        Consumer c = new Consumer(drop);
        new Thread(p).start();
        new Thread(c).start();
    }
}