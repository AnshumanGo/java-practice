package com.practice.java._2variables;

public class _1LocalVariable {

    public static void main(String[] args) {

        _1LocalVariable localVariable = new _1LocalVariable();
        localVariable.localVar();
        /*local scope is within method only.
        If used it will give compile time error as cannot find symbol*/
        /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	i cannot be resolved or is not a field

	at com.practice.java._2variables._1LocalVariable.main*/
        //System.out.println(localVariable.i);
    }

    void localVar() {

        /*local variable cant be declared with static .
        If done it will throw compile time error as illegal start of expression*/
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Illegal modifier for parameter j; only final is permitted
		 * 
		 * at
		 * com.practice.java._2variables._1LocalVariable.localVar(_1LocalVariable.java:
		 * ) at
		 * com.practice.java._2variables._1LocalVariable.main(_1LocalVariable.java:)
		 */
        //static int j=2;
        int i = 10;
        System.out.println("Value of local integer variable i : " + i);
    }
}
