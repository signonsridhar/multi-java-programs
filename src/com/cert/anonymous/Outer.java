package com.cert.anonymous;

/**
 * Created by sridhar on 8/5/16.
 */
public class Outer {
    private int number ;

    public Outer(int number){
        this.number = number;
    }

    class InnerClass{
        void printOuterNumber(){
            System.out.println(number);
        }

    }

    public void localInnerMethod(){
        class localInner{
            void printNumber(){
                System.out.println(number);
            }
        }
        new localInner().printNumber();
    }

    AnonymousInterface foo(){
        return new AnonymousInterface() {
            @Override
            public void printAnon() {
                System.out.println(number);
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer(10);
        outer.new InnerClass().printOuterNumber();
        outer.localInnerMethod();
        outer.foo().printAnon();
    }


}

interface AnonymousInterface{
    void printAnon();
}
