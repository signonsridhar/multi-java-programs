package com.cert.collections.blockingQueue;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created by sridhar on 13/4/16.
 */
public class Producer implements Runnable {
    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0;i < 100; i++){
            try {
                Message msg = new Message("" + i);
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Added msg " + msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
