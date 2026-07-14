package PaymentDemo.SRC;

import PaymentDemo.Impl.AmazonPay;
import PaymentDemo.Impl.Gpay;
import PaymentDemo.Impl.Phonepay;
import PaymentDemo.Gateway.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        PaymentGateway amazon = new AmazonPay();
        PaymentGateway gpay = new Gpay();
        // PaymentGateway phonepay = new Phonepay();
        System.out.println("Gpay.......................");
        gpay.pay();
        gpay.checkBalance();
        gpay.history();

        // System.out.println("Phonepay................");
        // phonepay.pay();
        // phonepay.checkBalance();
        // phonepay.history();

        System.out.println("Amazonpay.................");

        amazon.pay();
        amazon.checkBalance();
        amazon.history();

        PaymentGateway.thankyou();

    }

}
