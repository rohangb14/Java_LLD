package LambdasIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        // Creating a Runnable using a lambda expression
        Runnable runnable = (() -> {
            System.out.println("Hello Lambdas !!");
        });

        // Creating and starting a Thread using a lambda expression for the Runnable
        Thread thread = new Thread(() -> {
            System.out.println("Hi Again !!");
        });

        // Start the thread
        thread.start();

        // Create a list and add some integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        // Sort the list in ascending order using a lambda expression
        Collections.sort(list, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });

        // Sort the list in descending order using a lambda expression
        Collections.sort(list, (Integer i1, Integer i2) -> {
            return i2 - i1;
        });

        // Sort the list in ascending order using a more concise lambda expression
        Collections.sort(list, (i1, i2) -> i1 - i2);

        // Create an ExecutorService using a cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit a task to the ExecutorService using a lambda expression
        executorService.submit(() -> {
            return 1; // Return an integer value (not used in this example)
        });

        // Shut down the ExecutorService
        executorService.shutdown();
    }
}
