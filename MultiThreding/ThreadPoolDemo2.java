package MultiThreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 465, 67, 54 };

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("R1 Running ");
            }

        };
        executor.submit(r1);

        Runnable r2 = new Runnable() {

            @Override
            public void run() {
                System.out.println("R2 Running ");
            }

        };
        executor.submit(r2);

        Runnable r3 = new Runnable() {

            @Override
            public void run() {
                System.out.println("R3 Running ");
            }

        };
        executor.submit(r3);
        executor.shutdown();

    }

}
