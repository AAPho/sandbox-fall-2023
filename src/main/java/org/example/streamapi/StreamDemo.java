package org.example.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        String randomString = Stream.generate(new StringGenerator())
                .limit(512)
                .collect(Collectors.joining());
        System.out.println(randomString);
    }
}