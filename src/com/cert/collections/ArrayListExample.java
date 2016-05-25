package com.cert.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sridhar on 16/2/16.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Sridhar");
        arrayList.add("Padma");
        arrayList.add("Brinda");
        arrayList.add("Tapas");

        System.out.println(arrayList);

        arrayList = new ArrayList<String>(
                Arrays.asList("Tapas", "Brinda", "Padma", "Sridhar")
        );
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
