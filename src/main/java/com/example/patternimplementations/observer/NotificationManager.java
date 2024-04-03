package com.example.patternimplementations.observer;

public class NotificationManager implements PaymentListener{

    public void sendNotification(){
        System.out.println("Notification");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }
}
