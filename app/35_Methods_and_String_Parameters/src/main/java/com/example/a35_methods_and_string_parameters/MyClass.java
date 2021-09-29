package com.example.a35_methods_and_string_parameters;

public class MyClass {
    public static void main(String[] args) {

        anotherMethod("Hello");
        showName();

    }

    //void doesn't return anything
    public static void showName() {
        for (int i=0; i < 20; i++) {
            //will run this code here
            if (i % 3 == 0) {
                System.out.println(i + " is a multiple of 3");
            }
        }
        System.out.println("From ShowName ");
    }

    public static void anotherMethod(String something) {
        System.out.println("Another Method " + something);
    }
}