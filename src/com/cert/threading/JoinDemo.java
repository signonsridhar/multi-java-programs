package com.cert.threading;

/**
 * Created by sridhar on 9/2/16.
 */
public class JoinDemo {

    public static void main(String[] args) {

        Thread designTask = new Thread(new DesignTeam());
        designTask.start();

        Thread dev = new Thread(new DevTeam(designTask));
        dev.start();

        JoinDemo demo = new JoinDemo();

        System.out.println("Exiting after join");

    }
}
class DevTeam implements Runnable {
    Thread designTeam;
    public DevTeam(Thread designTeam) {
        this.designTeam = designTeam;
    }

    @Override
    public void run() {
        System.out.println("waiting for DesignTeam to finish");
        try {
            designTeam.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DesignTeam implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}