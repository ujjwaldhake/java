package Exception_Handling;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 1000) { // Minimum balance = 1000
            throw new MinimumBalanceException("Withdrawal denied! Minimum balance of ₹1000 must be maintained.");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        try {
            account.withdraw(4500);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

    }

}