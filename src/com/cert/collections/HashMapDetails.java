package com.cert.collections;

import java.util.*;

/**
 * Created by sridhar on 16/2/16.
 */
public class HashMapDetails {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(3, "Three");
        hm.put(2333,"Two" );
        hm.put(553, "FiftyThree");

        System.out.println(hm);

        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        hm.remove(1);
        System.out.println(hm);

        //Compare by Values in HashMap
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        List list = new LinkedList(entrySet);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable)((Map.Entry)o1).getKey()).compareTo(((Map.Entry)o2).getKey());
            }
        });
        System.out.println(list);
    }
}
