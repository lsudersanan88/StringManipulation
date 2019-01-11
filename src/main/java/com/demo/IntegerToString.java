package com.demo;

public class IntegerToString {
    public static void main(String[] args) {

        String price1 = "" + 123;
        System.out.println(price1);

        String price2 = String.valueOf(123);
        String price3 = String.format ("%d", 123);
        new StringBuilder().append( "" ).append( 10 ).toString();

    }
}
