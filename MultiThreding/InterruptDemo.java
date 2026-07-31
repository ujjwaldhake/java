package MultiThreding;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            for (int i = 0; i <= 10; i++) {
                System.out.println("my Tread");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            // e.printStackTrace();
        }
    }
}

public class InterruptDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        for (int i = 0; i <= 10; i++) {
            System.out.println("main Tread");
        }
    }

}
