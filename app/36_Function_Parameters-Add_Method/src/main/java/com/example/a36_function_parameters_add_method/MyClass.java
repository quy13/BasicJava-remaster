package com.example.a36_function_parameters_add_method;

public class MyClass {

    public static void main(String[] args) {

//    anotherMethod("Hello", 91);
//    showName();

    addNumbers(12,12);



}


    public static void showName() {
        for (int i=0; i < 20; i++) {
            //will run this code here
            if (i % 3 == 0) {
                System.out.println(i + " is a multiple of 3");
            }
        }
        System.out.println("From ShowName ");
    }
    public static void anotherMethod(String something,int age) {
        if (age > 90) {
            System.out.println("Im still young");
        }

        System.out.println("Another Method " + something + " " + age);
    }
    public static void addNumbers(int a, int b){

        System.out.println("Result: " + (a + b));

    }


}