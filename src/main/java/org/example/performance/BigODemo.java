package org.example.performance;

import java.util.*;

public class BigODemo {

    public static void main(String[] args) {

        // O(1)
        List<String> list = new ArrayList<>();

        // O(1)
        if (list.size() > 10) {

            // O(n)
            while(list.size() > 10){

            }

            // O(n^2)
            while(list.add("value") != false) {

            }

            // O(n)
            if(list.contains("value")) {

            }
        }

        // 1 + 1 + n + n^2 + n = 2 + 2n + n^2 = O(n^2)

    }
}