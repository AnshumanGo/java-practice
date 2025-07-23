package com.practice.java._14javamultithreading;

import java.util.concurrent.*;

public class _4_1JavaScheduledThreadPool implements Runnable {

    private String message;

    public _4_1JavaScheduledThreadPool(String s) {

        this.message = s;
    }

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch lock = new CountDownLatch(3);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Sjtp");
            lock.countDown();
        }, 500, 100, TimeUnit.MILLISECONDS);
		
		
		  lock.await(500, TimeUnit.MILLISECONDS);
		 		 
        //future.cancel(true);

        for (int i = 1; i <= 5; i++) {

            Runnable worker = new _4_1JavaScheduledThreadPool("" + i);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }

        System.out.println("Finished all threads");
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();
    }

    private void processMessage() {
        try {

            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}