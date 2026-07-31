package MultiThreding;

class SharedData {

    volatile boolean flag = false;
}

public class VolatileDemo {

    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread t1 = new Thread(() -> {

            System.out.println("Waiting...");

            while (!data.flag) {

            }

            System.out.println("Flag changed.");
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            data.flag = true;

            System.out.println("Flag updated.");
        });

        t1.start();
        t2.start();
    }
}