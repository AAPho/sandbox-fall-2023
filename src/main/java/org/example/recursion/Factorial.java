package org.example.recursion;

public class Factorial {

    public static int factorialIterative(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int factorialRecursive(int n){
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n -1);
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.println(Factorial.factorialIterative(x));
            System.out.println(Factorial.factorialRecursive(x));
        }
    }


}
