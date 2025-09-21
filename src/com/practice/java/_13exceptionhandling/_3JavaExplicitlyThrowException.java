package com.practice.java._13exceptionhandling;

public class _3JavaExplicitlyThrowException {

    // explicitly throw an exception using throw keyword
    static void validate(String name) {
        if (name.contains("&"))
            throw new RuntimeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try {
            validate("asdfsd&");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("rest of the code...");
        }
    }
}
