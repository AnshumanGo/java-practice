package com.practice.java._2variables;

public class _3StaticVariable {

    //When you need something that will be used throughout the application and every instance need to know the variable.
	/*
	 * if strVar is not declaredas as static , then
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	 * Cannot make a static reference to the non-static field strVar
	 * 
	 * at
	 * com.practice.java._2variables._3StaticVariable.main(_3StaticVariable.java:12)
	 */
    static String strVar = "test";

    public static void main(String[] args) {

        _3StaticVariable staticVariableOne = new _3StaticVariable();

        System.out.println("Static variable strVar value is " + strVar);

        staticVariableOne.printStaticVariableValue();
    }

    void printStaticVariableValue() {

        System.out.println("From non static method : Static variable strVar value is " + strVar);
    }

}
