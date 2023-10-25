package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {

        // x -> x + 2

        // 4 classes
        // Predicate - takes 1 value return a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value and return 1 value
        Function<Integer, Integer> function = x -> x + 2;

        // Supplier - takes nothing and returns 1 value
        Supplier<String> supplier = () -> "Hello Lambda!";

        // Consumer - takes 1 value and returns nothing
        Consumer<String> consumer = System.out::println;

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}