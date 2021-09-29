package com.example.a21_27_java_operator;

public class MyClass {
    public static void main(String[] args) {

        /*
        * 21. Java Operators
        * */

//        int a = 22;
//        int b = 8;
//        int sum  = a + b;
//        int diff = a - b;
//        int mult = a * b;
//        int quot = a / b;
//
//        System.out.println("the sum is " + sum);
//        System.out.println("the product is " + mult);
//        System.out.println("the difference is " + diff);
//        System.out.println("the quotient is " + quot);

        double a = 22;
        double b = 8;
        int sum  = (int) (a + b);
        int diff = (int) (a - b);
        int mult = (int) (a * b);
        double quot = a/b;
        System.out.println("the product is " + mult);
        System.out.println("the sum is " + sum);
        System.out.println("the difference is " + diff);
        System.out.println("the quotient is " + quot);

        //22. The Remainder
        //Remainder = % --> "what remains..."
        double remainder = a%b;
        System.out.println("the Remainder is "+remainder);

        /*
        23-24.  Logical and Relational Operators

        ------Relational Operators------
        == --> comparison
        =  -->  assignment
        != --> Not Equal
        -------Logical Operators--------
        !  --> Not/Negate(Phủ_Định)
        <  --> less than
        >  --> greater than
        <= --> less than or equal to
        >= --> greater than or equal to
        && --> AND require All to be true
        || --> OR  require one of them to be true
        !  --> NOT (negate or reverse logical values)
        --------------------------------
         */
        int c = 90;
        int d = 99;
        boolean isTall =true;

        if (c <= d){
            System.out.println("Running...");
        }else{
            System.out.println("Keep Running...");
        }

        if (!isTall){
            System.out.println("True...");
        }else{
            System.out.println("not True");
        }


//      25.  Logical:AND
        int age = 18;
        boolean isCitizen = true;
        boolean notAFelon = false;
        if ( (age >= 18) && (isCitizen) && (notAFelon) ){
            System.out.println("You can Vote!");
        } else {
            System.out.println("You are not Eligible to Vote!");
        }


//      26. The OR Logical Operator    || -> OR
        int e = 12;
        int f = 11;
        boolean isSnowing = false;


        if ( (e > f) || (isSnowing == false) && (e < 78)  ) {
            System.out.println("True since one or both conditions are true");
        }else {
            System.out.println("False since both conditions are false");
        }

//      27.  Logical:NOT
        boolean isFunny = true;

        if (!isFunny) {
            System.out.println("Not funny");
        }else {
            System.out.println("Funny");
        }

        int ages = 23;
        if ( !(ages > 10) || (isFunny == true) && (ages < 89) ) {

        }else {
            System.out.println("Not true");
        }

    }
}