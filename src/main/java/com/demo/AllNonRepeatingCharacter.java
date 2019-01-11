package com.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AllNonRepeatingCharacter {
    public static void main(String[] args) {
        Map<Character, Integer> map = new ConcurrentHashMap<>();
        String string = "aaaaaaabbvvvvsp";
        char[] chars = string.toCharArray();

        for (char character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
                System.out.println();
            }
        }
            /*if (map.get(character) == 1)
            {
                System.out.println(character);
            }*/

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            }

        }
    }
