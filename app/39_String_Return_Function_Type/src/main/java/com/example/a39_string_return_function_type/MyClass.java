package com.example.a39_string_return_function_type;

public class MyClass {
    public static void main(String[] args) {
        System.out.println( showBio("Steve", " I was born in NewYork", 23) );
    }

    private static String showBio(String name, String bio, int age) {
        String description = " My name is " + name +
                             " and i am " + age +
                             " years old. \n" + bio;

        return description;
    }
}