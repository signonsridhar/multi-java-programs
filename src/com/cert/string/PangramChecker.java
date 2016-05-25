package com.cert.string;

/**
 * Created by sridhar on 25/5/16.
 */

public class PangramChecker {

    private static final int NO_OF_LETTERS_OF_ALPHABET = 26;

    public static void main(String[] args) {
        String sentence = "Freight to me sixty dozen quart jars and twelve "
                + "black pans.";
        System.out.println("Is pangram : " + isPangram(sentence));
    }

    private static boolean isPangram(String sentence) {

        if (sentence.length() < NO_OF_LETTERS_OF_ALPHABET) {
            return false;
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (sentence.indexOf(ch) < 0
                    && sentence.indexOf((char) (ch + 32)) < 0) {
                return false;
            }
        }

        return true;
    }
}