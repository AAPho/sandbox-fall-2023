package org.example.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CollectionExample {

    /*
    adding values input from the command line
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        boolean getInput = true;

        System.out.println("Enter numbers to add.  Enter 0 to finish and get sum.");

        while(getInput) {
            try {

                System.out.print("Enter value: ");
                int value = scanner.nextInt();
                if(value > 0) {
                    values.add(value);
                } else {
                    getInput = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred.");
                scanner.nextLine();
            }
        }

        Integer sum = values.stream()
                        .reduce(0, (acc, value) -> acc + value);
        System.out.println("Sum is: " + sum);

    }
}