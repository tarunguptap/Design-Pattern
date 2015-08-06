package com.behavioral.strategy.example;

public interface PaymentMethod {
    public void purchase(String item);
}

class DebitCard implements PaymentMethod {

    @Override
    public void purchase(String item) {
        System.out.println(item + " payment done via debit card");
    }

}

class Cash implements PaymentMethod {

    @Override
    public void purchase(String item) {
        System.out.println(item + " payment done via cash");
    }

}
