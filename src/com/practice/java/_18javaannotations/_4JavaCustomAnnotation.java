package com.practice.java._18javaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int value();
}

public class _4JavaCustomAnnotation {

    public static void main(String[] args) throws Exception {

        _4JavaCustomAnnotation h = new _4JavaCustomAnnotation();
        Method m = h.getClass().getMethod("sayHello");

        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + manno.value());
    }

    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.println("hello annotation");
    }
}