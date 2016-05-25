package com.cert.threading;

/**
 * Created by sridhar on 10/2/16.
 */
public class ID
{
    private int counter; // initialized to 0 by default

    public  int getID()
    {
        System.out.println("holds Lock A" + Thread.holdsLock(this) + " "+ this.toString());
        return counter++;
    }

    public static void main(String[] args) {
        final ID id = new ID();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int val = id.getID();
                System.out.println("holds Lock B" + Thread.holdsLock(id) + " "+ this.toString() + " " + val);
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}
/* read-modify-write problem, read counter, modify counter, write counter, interleaving of threads,
solution modify to   synchronized getID() method
holds Lock Afalse com.cert.threading.ID@79b04310
holds Lock Afalse com.cert.threading.ID@79b04310
holds Lock Bfalse com.cert.threading.ID$1@1d83bfee 1
holds Lock Bfalse com.cert.threading.ID$1@1d83bfee 0
 */

