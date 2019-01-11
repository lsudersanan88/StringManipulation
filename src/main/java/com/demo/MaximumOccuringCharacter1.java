package com.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MaximumOccuringCharacter1 {


    public static void main(String[] args) {

        String string = "aaaaaaabbvvvvs";
        int maxOccurring = 0;
        char[] chars = string.toCharArray();
        Map<Character, Integer> map = new ConcurrentHashMap<>();

        for (char character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }

        }
        // System.out.println(map);
        Character key = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            //System.out.println(entry);
            if(entry.getValue() > maxOccurring)
            {
                key = entry.getKey();
                maxOccurring = entry.getValue();

            }
        }
        System.out.println(key +" "+maxOccurring);
    }
}