package org.example.generics;

public class StringUtil {

    public static String concatenate(String s1, String s2){
        return s1 + s2;
    }

    public static <T> String concatenate(String s1, T s2){
        return s1 + s2.toString();
    }



}
