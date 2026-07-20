package MultiThreding;
class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Custom Thread");
        }
    }
}

public class MultiThreadingDemo22 {
    public static void main(String[] args) {

        MyThread2 t = new MyThread2();
        t.start();

        for(int i = 0; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}