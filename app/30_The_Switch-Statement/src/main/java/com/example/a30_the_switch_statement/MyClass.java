package com.example.a30_the_switch_statement;

public class MyClass {
    public static void main(String[] args) {
//        char grade = 'A';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("A is for Awesome!");
//                System.out.println("Made mom proud.");
//                break;
//            case 'B':
//                System.out.println("B is for Beautifully done!");
//                break;
//            case 'C':
//                System.out.println("C is for Careless.");
//                break;
//            default:
//                System.out.println("F is for Future Unknown!");
//
//        }

        int command = 0;

        switch (command) {
            case 0:
                System.out.println("CodeRunner running North");
                break;
            case 1:
                System.out.print("CodeRunner running South");
                break;
            case 2:
                System.out.print("CodeRunner running West");
                break;
            case 3:
                System.out.print("CodeRunner running East");
                break;
            default:
                System.out.print("CodeRunner is confused - doesn't know where to go!");

        }

    }
}