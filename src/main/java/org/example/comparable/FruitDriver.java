package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 100);
        Fruit apple2 = new Fruit("Apple",150);
        Fruit apple3 = new Fruit("Apple", 50);
        Fruit orange = new Fruit("Orange", 50);
        Fruit banana = new Fruit("Banana", 50);
        Fruit peach = new Fruit("Peach", 200);
        Fruit peach2 = new Fruit("Peach", 100);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(apple2);
        fruits.add(apple3);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(peach2);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);


    }

}
