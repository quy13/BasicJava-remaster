package com.example.a30_the_switch_statement;

public class MyClass {
    public static void main(String[] args) {

        char grade = 'A';

//        if (grade == 'A') {
//            System.out.println("A is for Awesome!");
//        }else if (grade == 'B'){
//            System.out.println("B is for Beautifully done!");
//        }else if (grade == 'C') {
//            System.out.println("C is for Careless.");
//        }else if (grade == 'F') {
//            System.out.println("F is for Future Unknown.");
//        }

        switch (grade) {
            case 'A':
                System.out.println("A is for Awesome!");
                System.out.println("Made mom proud.");
                break;
            case 'B':
                System.out.println("B is for Beautifully done!");
                break;
            case 'C':
                System.out.println("C is for Careless.");
                break;
            default:
                System.out.println("F is for Future Unknown!");

        }
    }
}