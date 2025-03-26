package com.practice.java._20javacollections;

import java.util.concurrent.CopyOnWriteArraySet;

public class _21JavaCopyOnWriteArraySet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> scowas = new CopyOnWriteArraySet<>();

        scowas.add("Brahmha");
        scowas.add("Vishnu");
        scowas.add("Mahesh");

        System.out.println("Set: " + scowas);

        Thread readDataThread = new Thread(() -> {
            for (String item : scowas) {
                System.out.println("Reading: " + item);
            }
        });

        Thread writeDataThread = new Thread(() -> {
            scowas.add("Ganesh");
            System.out.println("Added Ganesh");
        });

        readDataThread.start();
        writeDataThread.start();
    }
}
