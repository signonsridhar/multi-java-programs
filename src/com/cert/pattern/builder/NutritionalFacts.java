package com.cert.pattern.builder;

/**
 * Created by sridhar on 3/4/16.
 */
public class NutritionalFacts {
    private int servingSize;
    private int servings;

    //optional parameters
    private int calories;
    private int fat;

    public static class Builder {
        private int servingSize;
        private int calories;
        private int servings;
        private int fat;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public NutritionalFacts build(){
            return new NutritionalFacts(this);
        }
    }

    private NutritionalFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat =  builder.fat;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("NutritionalFacts[servingSize]=").append(this.servingSize)
                .append("[servings]=").append(this.servings)
                .append("[calories]=").append(calories)
                .append("[fat]=").append(fat);
        return sb.toString();
    }

}
