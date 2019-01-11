package com.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String string = "aaaaaaabbvvvvsp";
        System.out.println(getFirstNonRepeatedChar(string));

    }

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>(str.length());
       // Map<Character, Integer> map = new HashMap<>(str.length());
        String string = "aaaataaabbvvvvsz";
        char[] chars = string.toCharArray();
        for (char character : chars)
        {
            if (map.containsKey(character)) {
                System.out.println();
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
                System.out.println();
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }


        return 0;

       /* Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");

*/
    }

}