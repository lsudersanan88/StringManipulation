package com.demo;

public class StringRotation {
    public static void main(String[] args) {
        String original = "cdeab";
        String rotation = "cdeab";

        System.out.println(checkRotatation( original,  rotation));
    }

    public static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;

        }
        String concatenated = original + original;
        System.out.println(concatenated);
        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }
        return false;
    }

}