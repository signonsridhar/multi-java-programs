package com.cert.pattern.builder;

/**
 * Created by sridhar on 31/3/16.
 */
public class User {
    private String name;
    private int age;
    private int height;


    public static class Builder{
        private String name;
        private int age;
        private int height;


        public Builder name(String name){
            this.name  = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder height(int height){
            this.height = height;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }
    private User(Builder b){
        this.name = b.name;
        this.age = b.age;
        this.height = b.height;

    }

    @Override
    public String toString(){
        return "User[name]=" + name
                + "[age]=" + age
                + "[height]=" + height;
    }

    public static void main(String[] args){
        User user = new User.Builder()
                .name("Sridhar")
                .age(10)
                .height(160)
                .build();
        System.out.println("user name :" + user.name);

    }
}
