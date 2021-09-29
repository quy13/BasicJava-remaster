package com.example.section_7_8_challenge_dividing_and_multiplying_integers;

public class MyClass {
    public static void main(String[] args) {
        multiplyNumbers(8,5);
        divideNumbers(6,20);
    }

    private static void multiplyNumbers(int first, int second) {
        System.out.println("multiply result: "+ first*second);
    }

    private static void divideNumbers(int first, int second) {
        double result = (double) first/second;
        System.out.println("divide result: "+ result);
    }

    //Solution : Đáp Án

    //only need 1 parameter to be double
//    private static void divideNumbers(double first, int second) {
//        System.out.println("divide result: "+ first/second);
//    }

}