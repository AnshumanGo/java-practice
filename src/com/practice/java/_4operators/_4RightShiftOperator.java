package com.practice.java._4operators;

public class _4RightShiftOperator {

    public static void main(String[] args) {

        System.out.println("The value of (10 >> 2) is "+(double)(10 >> 2));//10/2^2
        System.out.println("The value of (10 / (int) Math.pow(2, 2)) is "+(double)(10 / (double) Math.pow(2, 2)));//10/2^2
        System.out.println("The value of (10 >> 6) is "+(double)(10 >> 6));//10/2^6
        System.out.println("The value of (10 / (int) Math.pow(2, 6)) is "+(double)(10 / (double) Math.pow(2, 6)));//10/2^6
        System.out.println("The value of (1 >> 7) is "+(double)(1 >> 7));//1/2^7
        System.out.println("The value of (1 / (int) Math.pow(2, 7)) is "+(double)(1 / (double) Math.pow(2, 7)));//1/2^7
    }
}
