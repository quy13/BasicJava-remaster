package com.example.a29_the_else_if_statement;

public class MyClass {
    public static void main(String[] args) {

        char grade = 'C';

        if (grade == 'A') {
            System.out.println("A is for Awesome!");
        }else if (grade == 'B'){
            System.out.println("B is for Beautifully done!");
        }else if (grade == 'C') {
            System.out.println("C is for Careless.");
        }else if (grade == 'F') {
            System.out.println("F is for Future Unknown.");
        }
    }
}