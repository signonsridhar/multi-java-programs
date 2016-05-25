package com.cert.collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sridhar on 12/4/16.
 */
public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<String> aL = new ArrayList<>();
        aL.add("Sridhar");
        aL.add("Jallapuram");
        aL.add("Sridhar");
        aL.add("Shyam");

        Collection<String> noDups = new HashSet<>(aL);
        System.out.println(noDups);

        //Collectors.toList
        List<String> filtered = noDups.stream().filter(el -> el.startsWith("S")).collect(Collectors.toList());
        System.out.println(filtered);



    }
}
