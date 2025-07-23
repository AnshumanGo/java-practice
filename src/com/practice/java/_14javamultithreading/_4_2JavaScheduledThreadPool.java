package com.practice.java._14javamultithreading;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

/**
 * A complete, working example demonstrating the use of ScheduledThreadPoolExecutor.
 */
public class _4_2JavaScheduledThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread started at: " + LocalTime.now());

        // Create a ScheduledThreadPoolExecutor with 2 core threads.
        // Using Executors.newScheduledThreadPool() is a convenient factory method.
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        // --- Task 1: A simple Runnable that executes once after a delay ---
        Runnable oneShotTask = () -> {
            System.out.println("  -> Task 1 (One-Shot) is executing at: " + LocalTime.now());
        };

        System.out.println("Scheduling a one-shot task to run after 3 seconds...");
        // schedule() returns a ScheduledFuture, which can be used to cancel or check status.
        ScheduledFuture<?> oneShotFuture = scheduledExecutorService.schedule(oneShotTask, 3, TimeUnit.SECONDS);


        // --- Task 2: A Runnable that executes repeatedly at a fixed rate ---
        Runnable periodicTask = () -> {
            System.out.println("    => Task 2 (Periodic) is executing at: " + LocalTime.now());
            // Adding a sleep to simulate work. If this work takes longer than the period (2s),
            // the next execution will start immediately after this one finishes.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Periodic task was interrupted.");
                Thread.currentThread().interrupt(); // Restore the interrupted status
            }
        };

        System.out.println("Scheduling a periodic task to run after an initial 5-second delay, then every 2 seconds.");
        // scheduleAtFixedRate() does not account for the task's own execution time.
        // A new task will be scheduled 2 seconds after the *start* of the previous one.
        ScheduledFuture<?> periodicFuture = scheduledExecutorService.scheduleAtFixedRate(periodicTask, 5, 2, TimeUnit.SECONDS);


        // --- Task 3: A Callable that returns a value after a delay ---
        Callable<String> callableTask = () -> {
            System.out.println("      ~> Task 3 (Callable) is executing at: " + LocalTime.now());
            // Simulate some work
            Thread.sleep(2000);
            return "Callable task completed successfully!";
        };

        System.out.println("Scheduling a callable task to run after 4 seconds...");
        ScheduledFuture<String> callableFuture = scheduledExecutorService.schedule(callableTask, 4, TimeUnit.SECONDS);

        // We can get the result from the Future. This call will block until the task is complete.
        try {
            String result = callableFuture.get(); // Blocks here
            System.out.println("      ~> Result from Callable: '" + result + "' at " + LocalTime.now());
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Let the main thread run for a while to see the periodic task execute a few times.
        System.out.println("Main thread is now waiting for scheduled tasks to run...");
        try {
            Thread.sleep(15000); // Let the scheduler run for 15 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // --- Graceful Shutdown ---
        System.out.println("\nMain thread is initiating shutdown...");
        // shutdown() waits for currently executing tasks to finish but doesn't accept new tasks.
        scheduledExecutorService.shutdown();
        try {
            // It's good practice to wait for the executor to terminate.
            if (!scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
                System.err.println("Executor did not terminate in the specified time.");
                // For a more forceful shutdown, you could call shutdownNow().
                scheduledExecutorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.err.println("Shutdown was interrupted.");
            scheduledExecutorService.shutdownNow();
        }

        System.out.println("Main thread finished at: " + LocalTime.now());
    }
}