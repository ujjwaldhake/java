package MultiThreding;

class BankAccount {
    int balance = 1000;

    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("is withdrawing ");
        } else {
            System.out.println("insufficient balance ");
        }
    }
}

class Consumer extends Thread {
    BankAccount bankaccount;

    public Consumer(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public void run() {
        bankaccount.withdraw(800);

    }
}

public class MultiThreadingSyncDemo1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Consumer c1 = new Consumer(b);
        Consumer c2 = new Consumer(b);
        c1.start();
        c2.start();

    }

}
