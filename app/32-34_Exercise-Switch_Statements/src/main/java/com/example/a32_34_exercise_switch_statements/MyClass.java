package com.example.a32_34_exercise_switch_statements;

public class MyClass {
    public static void main(String[] args) {

        //ATM exercise self
        //Withdraw || Deposit
//        String command = "Deposit";
//        int balance = 1000;
//        int amount = 100;
//        switch (command){
//            case "Withdraw":
//               balance = balance - amount; //balance -= amount
//                break;
//            case "Deposit":
//               balance = balance + amount; //balance += amount
//                break;
//            default:
//                System.out.println("There is nothing");
//                break;
//        }
//        System.out.println("Your balance used to be 1000, and now it is " + balance);

        //ATM exercise solution
        String command = "Deposit";
        int balance = 1000;
        int amount = 100;
        
        switch (command) {
            case "Withdraw":
                balance -= amount;  // balance = balance - amount;
                break;
            case "Deposit":
                balance += amount; //balance = balance + amount;
                break;
            default:
                System.out.println("Please choose a command");
                break;
        }
        System.out.println("Your balance used to be 1000 and now is " + balance);

    }
}