package MultiThreding;

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(
                Thread.currentThread().getName()
                + " Priority = "
                + Thread.currentThread().getPriority()
            );
        }
    }
}

public class PriorityDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("High");
        t2.setName("Low");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
