package com.demo;

public class StringToInteger {
    public static void main(String[] args) {

        //using Integer.parseInt
        int i = Integer.parseInt("123");
        System.out.println("i: " + i);

        //How to convert numeric string = "000000081" into Integer value = 81
        int j = Integer.valueOf("000000081");
        System.out.println("i: " + j);


    }
}
