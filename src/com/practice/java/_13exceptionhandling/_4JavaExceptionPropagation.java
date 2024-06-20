package com.practice.java._13exceptionhandling;

import java.io.IOException;

public class _4JavaExceptionPropagation {

    public static void main(String[] args) {

        // By default Unchecked Exceptions are forwarded in calling chain (propagated).
        JavaUncheckedExceptionPropagation javaUncheckedExceptionPropagation
                = new JavaUncheckedExceptionPropagation();
        javaUncheckedExceptionPropagation.p();

        //By default, Checked Exceptions are not forwarded in calling chain (propagated).
        JavaCheckedExceptionPropagation javaCheckedExceptionPropagation
                = new JavaCheckedExceptionPropagation();
        javaCheckedExceptionPropagation.p();
    }
}

class JavaUncheckedExceptionPropagation {

    // By default Unchecked Exceptions are forwarded in calling chain (propagated).
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Unchecked exception handled");
        }
    }
}

class JavaCheckedExceptionPropagation {

    //By default, Checked Exceptions are not forwarded in calling chain (propagated).
    void m() {
        //throw new IOException("device error");//checked exception either use try catch or add exception signature to method signature
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Checked exception handled");
        }
    }
}