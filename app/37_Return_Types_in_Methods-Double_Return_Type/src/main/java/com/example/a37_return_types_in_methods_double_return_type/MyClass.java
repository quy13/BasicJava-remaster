package com.example.a37_return_types_in_methods_double_return_type;

public class MyClass {
    public static void main(String[] args) {

    int finalResult = addNumbers(15, 15);
    System.out.println("The final result is: " + finalResult);
    System.out.println( fullName("George","The Man") );
    System.out.println( showChar('A') );

//    anotherMethod("Hello", 91);
//    showName();

    }

    //Return an integer
    public static int addNumbers(int a, int b){
        int result = 0;
        result = a + b;

        return result;
    }

    //Return a String
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    //Return a character
    public static char showChar(char c){
        return c;
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
}