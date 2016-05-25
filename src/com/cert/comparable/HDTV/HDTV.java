package com.cert.comparable.HDTV;

import java.util.Comparator;

/**
 * Created by sridhar on 11/4/16.
 */
public class HDTV implements Comparable<HDTV>{
    private int size;
    private String brand;
    private int price;

    public HDTV(int size, String brand, int price){
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public int compareTo(HDTV hdtv) {
        if (this.size > hdtv.size) {
            return 1;
        } else if (this.size < hdtv.size){
            return -1;
        } else
            return 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }

    public void setSize(int size){
        this.size = size;
    }

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof HDTV))
            return false;
        HDTV other = (HDTV)o;
        if (size != other.getSize() || !getBrand().equals(other.getBrand()) || price != other.getPrice() )
            return false;
        return true;
    }

    @Override
    public String toString(){
        return this.getBrand();
    }
}

class PriceComparator implements Comparator<HDTV> {

    @Override
    public int compare(HDTV t1, HDTV t2) {
        if (t1.getPrice() > t2.getPrice()){
            return 1;
        } else if (t1.getPrice() < t2.getPrice()){
            return -1;
        } else
            return 0;
    }
}