package PaymentDemo.Impl;

import PaymentDemo.Gateway.PaymentGateway;

public class AmazonPay implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Payment of 500 processed with Amazonpay");

    }

    @Override
    public void checkBalance() {
        System.out.println("total bal 500 ");

    }

    @Override
    public void history() {
        System.out.println("trn ID 483752358 , amount:-500 by Amazonpay");
    }

}
