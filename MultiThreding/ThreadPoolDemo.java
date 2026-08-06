package MultiThreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println(
                Thread.currentThread().getName());

    }
}

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);// Creates a thread pool with a maximum of 3 worker
                                                                   // threads.

        for (int i = 1; i <= 10; i++) {

            executor.execute(new MyTask());

        }

        executor.shutdown();
    }

}