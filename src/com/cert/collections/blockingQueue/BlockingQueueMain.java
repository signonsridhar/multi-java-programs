package com.cert.collections.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by sridhar on 13/4/16.
 */
public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        Producer p = new Producer(queue);
        new Thread(p).start();
        Consumer c = new Consumer(queue);
        new Thread(c).start();
        System.out.println("P and C has been started");
    }
}
