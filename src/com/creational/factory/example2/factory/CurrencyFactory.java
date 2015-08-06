package com.creational.factory.example2.factory;

import com.creational.factory.example2.inf.Currency;
import com.creational.factory.example2.inf.impl.Rupee;
import com.creational.factory.example2.inf.impl.SGDDollar;
import com.creational.factory.example2.inf.impl.USDollar;

public class CurrencyFactory {
    public static Currency createCurrency(String country) {
        if (country.equalsIgnoreCase("India")) {
            return new Rupee();
        } else if (country.equalsIgnoreCase("Singapore")) {
            return new SGDDollar();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}
