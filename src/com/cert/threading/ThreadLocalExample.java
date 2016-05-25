package com.cert.threading;

public class ThreadLocalExample {


    public static class MyRunnable implements Runnable {

        private ThreadLocal<Integer> threadLocal =
                new ThreadLocal<Integer>();
        private int nonLocal = 0;
        @Override
        public void run() {
            int ran = (int) (Math.random() * 100D);
            nonLocal = ran;
            threadLocal.set( ran );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(threadLocal.get() +  " " + nonLocal);
        }
    }


    public static void main(String[] args) throws InterruptedException{
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate

        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());

        thread3.start();
        thread4.start();

        /*thread3.join(); //wait for thread 1 to terminate
        thread4.join(); //wait for thread 2 to terminate
*/


    }

}

