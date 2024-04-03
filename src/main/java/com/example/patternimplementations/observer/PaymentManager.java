package com.example.patternimplementations.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> listeners = new ArrayList<>();

    public void pay(){
        System.out.println("PAYMENT NEW");
        listeners.forEach(l -> l.paymentMade());
    }

    public void registerListeners(PaymentListener ... paymentListeners){
        listeners.addAll(Arrays.asList(paymentListeners));
    }

    public void unregisterListeners(PaymentListener ... paymentListeners){
        listeners.removeAll(Arrays.asList(paymentListeners));
    }
}
