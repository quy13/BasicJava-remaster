package com.example.a33_the_do_while_loop;

public class MyClass {
    public static void main(String[] args) {
        //do while

        int limit = 10;
        int counter = 1;

        do {

            System.out.println("We keep counting...");
            counter++; // important otherwise you'll get an infinity loop!

        }while (counter < limit);
    }
}