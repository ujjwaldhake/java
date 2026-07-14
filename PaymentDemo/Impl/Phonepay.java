package PaymentDemo.Impl;

import PaymentDemo.Gateway.PaymentGateway;

public class Phonepay implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Payment of 500 processed with Phonpe");

    }

    @Override
    public void checkBalance() {
        System.out.println("total bal 500 ");

    }

    @Override
    public void history() {
        System.out.println("trn ID 483752358 , amount:-500 by phonpe");
    }

}
