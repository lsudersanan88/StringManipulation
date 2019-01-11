package com.demo;

import java.util.Arrays;

public class CountWords {

    public static void main(String[] args) {
        String test = "This sentence contains two words one and two sentence";
        String [] words = test.split("\\s+");
        System.out.println(Arrays.toString(words));
       int count =  words.length;
        System.out.println(count);
    }
}
