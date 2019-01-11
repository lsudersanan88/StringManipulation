package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveCharacter {

    public static void main(String[] args) {

        String string1 = "kvpattty";
        String string2 = "kv";
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        remove(chars1, chars2);
    }

    public static void remove(char[] chars1, char[] chars2)
    {
        int length1 = chars1.length;
       // int length2 = chars2.length;
      /*  ArrayList arrayList = new ArrayList();
        for (char character:chars1) {
           arrayList.add(character) ;
        }*/
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char character : chars1)
        {

            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
                System.out.println();
            } else {
                map.put(character, 1);
            }
        }
       // System.out.println(map);
        StringBuilder sb = new StringBuilder();

        for (char character2 : chars2)
            {
                if (map.containsKey(character2)) ;
                {
                    map.remove(character2);

                }
            }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            sb.append(entry.getKey());

        }
        System.out.println(sb);
            /*for(int i = 0; i<length1-1; i++ )
             {
            for(int j = 0; j<length2-1; j++ )
              {
                 if(chars1[i] == chars2[j])
                 {
                     arrayList.remove(chars1[i]); }
            }
        }
        System.out.println(arrayList);*/

    }
}