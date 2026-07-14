package PaymentDemo.Impl;

import PaymentDemo.Gateway.PaymentGateway;

public class Gpay implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Payment of 500 processed with Gpay");

    }

    @Override
    public void checkBalance() {
        System.out.println("total bal 500 ");

    }

    @Override
    public void history() {
        System.out.println("trn ID 483752358 , amount:-500 by Gpay");
    }

}
