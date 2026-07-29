package MultiThreding;

class Restaurant {

    private boolean foodReady = false;

    synchronized void order(String customerName) {

        while (!foodReady) {
            System.out.println(customerName + " is waiting for food...");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(customerName + " is eating food.");
    }

    synchronized void serveFood() {

        foodReady = true;

        System.out.println("Chef: Food is ready!");

        notifyAll();
    }
}

public class WaitNotifyDemo {

    public static void main(String[] args) throws InterruptedException {

        Restaurant rest = new Restaurant();

        Thread customer1 = new Thread(() -> {
            rest.order("Customer 1");
        });

        Thread customer2 = new Thread(() -> {
            rest.order("Customer 2");
        });

        Thread customer3 = new Thread(() -> {
            rest.order("Customer 3");
        });

        Thread chef = new Thread(() -> {
            rest.serveFood();
        });

        customer1.start();
        customer2.start();
        customer3.start();

        // Give customers time to start waiting
        Thread.sleep(2000);

        chef.start();
    }
}