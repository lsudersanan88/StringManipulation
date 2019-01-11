package com.demo.immutability;

public class ImmutableTest {

    public static void main(String[] args) {
        String s1 = new String("abc");
        s1.concat("dfg");
        //System.out.println(s1);

        String s2 = new String("dfg");
       // s1.concat(s2);
       // System.out.println(s1);
        String s3 = s1.concat(s2);
        System.out.println(s3);

    }
}
