package com.cert.string;

/**
 * Created by sridhar on 12/4/16.
 */
public class IsPalyndrome {
    public static boolean isPalindrome(String str){
        int len = str.length();
        for (int i=0; i< len;i++){
            if ((str.charAt(i) != str.charAt(len -i -1))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsPalyndrome.isPalindrome("m alayalam"));

    }
}
