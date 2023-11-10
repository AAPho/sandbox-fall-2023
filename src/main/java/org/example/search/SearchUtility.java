package org.example.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SearchUtility {

    public static void main(String[] args) {

        int[] intArray = {2, 4, 6, 5, 3, 1, -2, -1, 0};

        int[] sortedArray = IntStream.of(intArray)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 10));

        List<String> values = new ArrayList<>();
        values.add("Hello");
        values.add("World");
        values.add("Howdy");

        System.out.println(linearSearch(values, "Hello"));
        System.out.println(linearSearch(values, "Hello!"));

        String[] strings = {"Hello", "World", "Howdy"};

        System.out.println(linearSearch(strings, "Hello"));
        System.out.println(linearSearch(strings, "Hello!"));

        System.out.println(binarySearchIterative(sortedArray, 4));
        System.out.println(binarySearchIterative(sortedArray, 44));

    }

    public static int linearSearch(int[] array, int targetValue) {

        int found = Integer.MIN_VALUE;
        for (int i : array) {
            if (i == targetValue) {
                found = targetValue;
                break;
            }
        }
        return found;

    }

    public static <T> T linearSearch(List<T> objectList, T target) {

        T result = null;
        if (objectList.contains(target)) {
            result = objectList.get(objectList.indexOf(target));
        }
        return result;
    }

    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target) {

        boolean found = false;
        for (T t : array) {
            if (t.compareTo(target) == 0) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static int binarySearchIterative(int[] array, int targetValue) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                // If target is greater, ignore left half of subarray
                min = mid + 1;
            } else if (array[mid] > targetValue) {
                // If target is smaller, ignore right half of subarray
                max = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, final int targetValue) {

        return binarySearchRecursive(array, 0, (array.length -1), targetValue);

    }

    private static int binarySearchRecursive(int[] array, int minIndex, int maxIndex, int targetValue) {

        if(maxIndex >= minIndex) {

            int mid = minIndex + (maxIndex - minIndex) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                return binarySearchRecursive(array, mid + 1, maxIndex, targetValue);
            } else if (array[mid] > targetValue) {
                return binarySearchRecursive(array, minIndex, mid -1, targetValue);
            }

        }
        return -1;


    }

}