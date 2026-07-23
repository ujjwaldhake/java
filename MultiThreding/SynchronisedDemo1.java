package MultiThreding;

class BankAccount1 {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("is withdrawing ");
            balance = balance - amount;
            System.out.println(balance);
            System.out.println(Thread.currentThread().getName());

        } else {
            System.out.println("insufficient balance ");
        }
    }
}

class Consumer extends Thread {
    BankAccount1 bankaccount;

    public Consumer(BankAccount1 bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public void run() {
        bankaccount.withdraw(800);

    }
}

public class SynchronisedDemo1 {
    public static void main(String[] args) {
        BankAccount1 b = new BankAccount1();
        Consumer c1 = new Consumer(b);
        Consumer c2 = new Consumer(b);
        c1.start();
        c2.start();

    }

}
