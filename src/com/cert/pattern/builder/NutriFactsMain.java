package com.cert.pattern.builder;

/**
 * Created by sridhar on 3/4/16.
 */
public class NutriFactsMain {
    public static void main(String[] args) {
        NutritionalFacts facts = new NutritionalFacts.Builder(240, 8)
                .calories(1000).fat(500).build();
        System.out.println(facts);
    }
}
