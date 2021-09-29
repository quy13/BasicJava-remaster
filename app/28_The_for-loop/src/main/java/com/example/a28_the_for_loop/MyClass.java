package com.example.a28_the_for_loop;

public class MyClass {
    public static void main(String[] args) {

//        // Finding multiples of 2: chia hết cho 2
        int i = 0; // initializing i outside the for loop :
                    // khởi tạo i bên ngoài vòng lặp for
        for (; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a multiple of 2");
            }
        }

//        Initializing i inside the for loop
//        khởi tạo i bên trong vòng lặp for
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println("counter is " + i);
//        }
    }
}