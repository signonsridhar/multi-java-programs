package com.cert.collections.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by sridhar on 13/4/16.
 */
public class Consumer implements Runnable{


    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            Message msg = queue.take();
            while (!msg.getMsg().equals("exit")){
                Thread.sleep(10);
                msg = queue.take();
                System.out.println("Retrieved msg "+ msg.getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

