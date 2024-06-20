package com.practice.java._13exceptionhandling;

import java.io.IOException;

public class _5JavaExceptionThrowsDeclaration {

    public static void main(String args[]) {
        _5JavaExceptionThrowsDeclaration javaExceptionThrowsDeclaration = new _5JavaExceptionThrowsDeclaration();
        javaExceptionThrowsDeclaration.methodThree();
        System.out.println("Flow continues ....");
    }

    void methodOne() throws IOException {
        throw new IOException("method one io exception");//you should be only declaring checked exception
    }

    void methodTwo() throws IOException {
        methodOne();
    }

    void methodThree() {
        try {
            methodTwo();
        } catch (Exception e) {
            System.out.println("method one io exception handled");
        }
    }
}

