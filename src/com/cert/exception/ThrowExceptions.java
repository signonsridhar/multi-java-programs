package com.cert.exception;

import java.io.FileNotFoundException;

/**
 * Created by sridhar on 4/2/16.
 */
class ThrowExceptions {
    void method10() {
        try{
        }catch (Exception e){

        }
    }
    void method1() throws Error {}
    void method2() throws Exception {}
    void method3() throws Throwable {}
    void method4() throws RuntimeException {}
    void method5() throws FileNotFoundException {}
}