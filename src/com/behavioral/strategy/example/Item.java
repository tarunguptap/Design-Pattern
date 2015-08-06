package com.behavioral.strategy.example;

public class Item {

    public void purchase(String item, String paymentMethod) {
        if (paymentMethod.equals("debitCard")) {
            System.out.println(item + " payment done via debit card");
        } else {
            System.out.println(item + " payment done via cash");
        }

    }

}
