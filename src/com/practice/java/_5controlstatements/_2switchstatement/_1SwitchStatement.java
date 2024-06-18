package com.practice.java._5controlstatements._2switchstatement;

public class _1SwitchStatement {

    public static void main(String[] args) {

        //Declaring a variable for switch expression
        int year = 2024;
        //Switch expression
        switch (year) {
            //Case statements
            case 2028:
                System.out.println("Year value is : "+2028);
                break;
            case 2032:
                System.out.println("Year value is : "+2032);
                break;
            case 2084:
                System.out.println("Year value is : "+2084);
                break;
            //Default case statement
            default:
                System.out.println("Year value is : "+year);
        }
    }
}