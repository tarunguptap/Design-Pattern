package com.behavioral.strategy.example;

public class StrategicItem {

    public void purchase(String item, PaymentMethod paymentMethod) {
        paymentMethod.purchase(item);
    }

}
