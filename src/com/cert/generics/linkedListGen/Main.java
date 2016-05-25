package com.cert.generics.linkedListGen;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.offer("abc");
        list.offer("def");

        System.out.println(list);
    }
}
