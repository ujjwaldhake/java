package MultiThreding;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.err.println("MyThread" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();// Tread created
        t1.setName("Customer1");
        MyThread t2 = new MyThread();// Tread created
        t2.setName("Customer2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }

}
