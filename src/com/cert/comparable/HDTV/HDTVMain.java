package com.cert.comparable.HDTV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by sridhar on 11/4/16.
 */
public class HDTVMain {
    public static void main(String[] args) {
        HDTV h1 = new HDTV(55, "Sony", 30000);
        HDTV h2 = new HDTV(60, "Samsung", 40000);
        HDTV h3 = new HDTV(40, "T-Sharp", 30000);
        HDTV h4 = new HDTV(70, "Samsung", 60000);

        if (h1.compareTo(h2) > 0){
            System.out.println(h1.getBrand() + " is better than " + h2.getBrand());
        } else {
            System.out.println(h2.getBrand() + " is better than " + h1.getBrand());
        }

        List<HDTV> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new PriceComparator());
        System.out.println(list);

        TreeSet<HDTV> set = new TreeSet<>(new PriceComparator());
        set.add(h1);
        set.add(h2);
        set.add(h3);
        set.add(h4);
        System.out.println(set);//Sony, Samsung, Samsung //T-Sharp has same price as Sony, so ignored as duplicate

    }
}
