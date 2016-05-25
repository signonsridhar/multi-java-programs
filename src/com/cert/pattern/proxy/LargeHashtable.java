package com.cert.pattern.proxy;

import java.util.Hashtable;

/**
 * Created by sridhar on 3/4/16.
 */
public class LargeHashtable extends Hashtable {
    private ReferenceCountedHashtable theHashtable;

    public LargeHashtable(){
        theHashtable = new ReferenceCountedHashtable();
    }

    public int size(){
        return theHashtable.size();
    }
}

class ReferenceCountedHashtable extends Hashtable {
    private int proxyCount = 1;
    public ReferenceCountedHashtable(){
        super();
    }

    public synchronized Object clone() {
        ReferenceCountedHashtable copy;
        copy = (ReferenceCountedHashtable) super.clone();
        copy.proxyCount = 1;
        return copy;
    }

    public int size(){
        return 5;
    }

}