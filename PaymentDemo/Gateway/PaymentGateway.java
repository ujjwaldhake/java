package PaymentDemo.Gateway;

public interface PaymentGateway {
    void pay();

    void checkBalance();

    void history();

    static void thankyou() {
        System.out.println("thank you for using our services");
    }

}
