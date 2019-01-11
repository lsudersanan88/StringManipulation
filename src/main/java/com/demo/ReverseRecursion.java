package com.demo;

public class ReverseRecursion {

    public static void main(String[] args) {
        String string = "kvpatty";
        System.out.println(reverse ( string));
    }

    public static  String reverse (String string)
    {
        if ((null == string) || (string.length() <= 1)) {
            return string;
        }
       return   reverse (string.substring(1))+string.charAt(0);
    }
}
