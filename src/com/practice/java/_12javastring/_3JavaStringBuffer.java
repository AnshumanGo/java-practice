package com.practice.java._12javastring;

public class _3JavaStringBuffer {

    public static void main(String[] args) {

        //StringBuffer is Thread safe and synchronized, so less efficient as it will take more time
        StringBuffer sb = new StringBuffer("Sb");
        System.out.println(sb);
    }
}
