package com.cert.serialization;

import java.io.*;

/**
 * Created by sridhar on 5/4/16.
 */
public class BoxMain {
    public static void main(String[] args) {
        try {
            Box box = new Box();
            box.setHeight(20);
            box.setWidth(30);
            FileOutputStream fos = new FileOutputStream("foo.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(box);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("foo.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Box obj = (Box)ois.readObject();
            System.out.println( obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
