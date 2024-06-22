package com.practice.java._14javamultithreading;

public class _7JavaSingleTaskMultipleThread extends Thread {

    public static void main(String[] args) {

        _7JavaSingleTaskMultipleThread javaSingleTaskMultipleThreadOne = new _7JavaSingleTaskMultipleThread();
        _7JavaSingleTaskMultipleThread javaSingleTaskMultipleThreadTwo = new _7JavaSingleTaskMultipleThread();
        _7JavaSingleTaskMultipleThread javaSingleTaskMultipleThreadThree = new _7JavaSingleTaskMultipleThread();


        javaSingleTaskMultipleThreadOne.start();
        javaSingleTaskMultipleThreadTwo.start();
        javaSingleTaskMultipleThreadThree.start();
    }

    @Override
    public void run() {

        System.out.println("Java Single Task Multiple Thread");
    }
}