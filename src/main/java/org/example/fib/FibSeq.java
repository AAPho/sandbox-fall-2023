package org.example.fib;

import java.util.HashMap;
import java.util.Map;

public class FibSeq {

    private Map<Integer, Long> dictionary = new HashMap<>();

    public static void main(String[] args) {
        FibSeq fn = new FibSeq();

        for (int x = 0; x <= 50; x++) {
            System.out.println(x + " : " + fn.fib(x));
        }
    }

        private long fib(int x) {
            if (x == 0) {
                return 0L;
            }
            if (x == 1) {
                return 1L;
            }

            return memo(x -1) + memo(x -2);
        }

        private long memo(int m) {

            Long value = dictionary.get(m);

            if (value != null){
                return value;
            }

            value = fib(m);
            dictionary.put(Integer.valueOf(m), value);
            return value;
        }

}

