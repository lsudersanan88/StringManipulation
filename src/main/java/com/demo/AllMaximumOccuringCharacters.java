package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AllMaximumOccuringCharacters {


    public static void main(String[] args) {
        String string = "aabbc";
        maximumOccurringChars(string);
    }

    public static List<Character> maximumOccurringChars(String string) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> occurrences = new ArrayList<>();
        int maxOccurring = 0;
        char[] chars = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
                System.out.println();
            } else {
                map.put(character, 1);
            }
        }

        Character key = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() >= maxOccurring) {
               // key = entry.getKey();
                maxOccurring = entry.getValue();
                occurrences.add(entry.getKey());

            }

        }

        System.out.println(occurrences);
        return occurrences;
    }

}
