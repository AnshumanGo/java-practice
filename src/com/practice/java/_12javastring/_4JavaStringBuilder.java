package com.practice.java._12javastring;

public class _4JavaStringBuilder {

    public static void main(String[] args) {

        //StringBuilder is not Thread safe and non-synchronized so more efficient as it will take less time
        StringBuilder sbldr = new StringBuilder("sbldr");
        System.out.println(sbldr);
    }
}
