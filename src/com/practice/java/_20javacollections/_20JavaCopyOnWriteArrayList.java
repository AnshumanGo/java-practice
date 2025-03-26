package com.practice.java._20javacollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class _20JavaCopyOnWriteArrayList {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> scowal = new CopyOnWriteArrayList<>();

        scowal.add("Brahmha");
        scowal.add("Vishnu");
        scowal.add("Mahesh");

        Thread updateDataThread = new Thread(() -> {
            scowal.add("Ganesh");
            System.out.println("Added Ganesh");
        });
        updateDataThread.start();

        Thread.sleep(1000);

        Iterator itr = scowal.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(scowal);
    }
}
