package com.practice.java._15javaruntimeclass;

import java.io.IOException;

public class _1JavaRuntimeClass {

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        for (int i = 0; i < 10000; i++) {
            new _1JavaRuntimeClass();
        }
        System.out.println("After creating 10000 instance, Free Memory: " + runtime.freeMemory());
        System.gc();

        System.out.println("After gc(), Free Memory: " + runtime.freeMemory());

        runtime.exec("notepad");

		/*
		 * Do not remove comments for below line as this line is to restart Windows
		 * systems which looks like as compatible with Windows 11 . Not sure about
		 * backward compatibility with older version of windows os
		 */
        //runtime.exec("c:\\Windows\\System32\\shutdown -r -t 0");
    }
}
