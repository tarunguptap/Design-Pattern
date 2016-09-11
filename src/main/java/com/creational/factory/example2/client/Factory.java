package com.creational.factory.example2.client;

import com.creational.factory.example2.factory.CurrencyFactory;
import com.creational.factory.example2.inf.Currency;

public class Factory {
    public static void main(String args[]) {
        // String country = args[0];
        String country = "India";
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}
