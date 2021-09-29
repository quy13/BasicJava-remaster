package com.example.a17_20_java_variable_types;

public class MyClass {
    public static void main(String[] args) {
        /*
         comment
        */
        //Variable == bucket in memory
        String firstName = "James";
        String lastName = "Bond";

        //17. Java Integer Variable Type
        int age = 25;
        int year = 198858796;

        //18. Java Long and Double Variable Types
        long bigNumber = 1988587968887799L;
        float celsius = 45.9f;
        double height = 5.9;

        //19. Java Byte and Char Variable Types
        byte myByte = 127;//8 bit
        short myShort = 289;//16 bit
        char letter = 'N';

        //20. Java Boolean Variable Type
        //Boolean = true or false , 1 or 0
        boolean isTall;
        isTall = true;
        System.out.println("Hi, my name is " +firstName+ " " +lastName+ " and I am " +age+ " years old.");
        System.out.println(year + letter);

    }
}