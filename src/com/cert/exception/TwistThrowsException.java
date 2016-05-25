package com.cert.exception;

/**
 * Created by sridhar on 21/1/16.
 */
import java.io.*;
public class TwistThrowsException {
    public void readFile(String file) throws FileNotFoundException {
        System.out.println("readFile");
        throw new FileNotFoundException();
    }
    void useReadFile(String name) throws FileNotFoundException {
        System.out.println("useReadFile");
        try {
            readFile(name);
        }
        catch (FileNotFoundException e) {
            //code
        }
    }
    public static void main(String args[])  throws FileNotFoundException {
        new TwistThrowsException().useReadFile("a");
    }
}
