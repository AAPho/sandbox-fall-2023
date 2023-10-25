package org.example.exception;

public class Calculator {

    //driver
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //System.out.println(calculator.divide(2,0));

        try {
            System.out.println(calculator.divide(2.0f,0.0f));
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            throw new RuntimeException(e); //method chaining
        }
    }

    public int divide(int a, int b){
        int returnValue = 0;

        try{
            returnValue = a / b;
        } catch (ArithmeticException e){
            System.err.println("ArithmericException");
            e.printStackTrace();
        }

        return returnValue;
    }

    public float divide(float a, float b) throws DivideByZeroException{
        if(b == 0){
            throw new DivideByZeroException("Division by zero");
        }
        return a / b;
    }

}
