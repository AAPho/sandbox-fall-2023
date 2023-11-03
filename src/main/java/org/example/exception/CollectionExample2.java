package org.example.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CollectionExample2 {

    /*
    adding odd/even numbers from the command line
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        System.out.println("Even/Odd adder.  Enter numbers to add.  Enter 0 to finish and get sums.");

        for(;;) {
            try {

                System.out.print("Enter value: ");
                int value = scanner.nextInt();

                if(value == 0) {
                    break;
                }

                if(value % 2 == 0) {
                    evenNumbers.add(value);
                } else {
                    oddNumbers.add(value);
                }

            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                // needed to reset scanner to next line
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred.");
                scanner.nextLine();
            }
        }

        Integer evenSum = evenNumbers.stream()
                .reduce(0, (acc, value) -> acc + value);
        Integer oddSum = oddNumbers.stream()
                .reduce(0, (acc, value) -> acc + value);


        System.out.println("Sum of the even numbers is: " + evenSum);
        System.out.println("Sum of the odd numbers is: " + oddSum);

    }

}