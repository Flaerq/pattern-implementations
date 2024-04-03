package com.example.patternimplementations.observer;

public class PaymentEventLogger implements PaymentListener{

    public void logEvent(){
        System.out.println("payment received");
    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
