package com.demo;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {
        String test = "This sentence contains two words one and two sentence";
        Set<String> duplicates = duplicateWords(test);
     //   System.out.println("input : " + test);
       // System.out.println("output : " + duplicates);
    }

    public static Set<String> duplicateWords(String input) {

        if (input == null || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        System.out.println(Arrays.toString(words));
        Set<String> set = new HashSet<>();
        for (String word:words) {
           if(!set.add(word))
           {
               System.out.println(word);
           }
        }

        return duplicates;
    }
}


