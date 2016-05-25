package com.cert.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sridhar on 16/2/16.
 */
public class ElephantComparable {
    public static void main(String[] args) {
        Elephant[] elephants = new Elephant[3];
        elephants[0] = new Elephant(10, 200, "Ramu");
        elephants[1] = new Elephant(19, 220, "Shamu");
        elephants[2] = new Elephant(15, 180, "Bheemu");
        Arrays.sort(elephants);//compare by age

        for (Elephant e: elephants){
            System.out.println(e);
        }

        Arrays.sort(elephants, new NameComparator());
        for (Elephant e: elephants){
            System.out.println(e);
        }

        Arrays.sort(elephants, new AgeComparatorGeneric());
        for (Elephant e: elephants){
            System.out.println(e);
        }
    }


}
class AgeComparatorGeneric implements Comparator<Elephant>{
    @Override
    public int compare(Elephant elephant, Elephant t1) {
        if (elephant.getAge() > t1.getAge())
            return 1;
        else if (elephant.getAge() < t1.getAge())
            return -1;
        else
            return 0;
    }
}
class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String n1 = ((Elephant)o1).getName();
        String n2 = ((Elephant)o2).getName();

        return n1.compareTo(n2);
    }
}
class Elephant implements Comparable{
    private int age;
    private float weight;
    private String name;

    public Elephant(int age, float weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Elephant other = (Elephant)o;
        if (this.weight > other.weight)
            return 1;
        else if (this.weight < other.weight)
            return -1;
        else //both weight's are same, compare age
            return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
