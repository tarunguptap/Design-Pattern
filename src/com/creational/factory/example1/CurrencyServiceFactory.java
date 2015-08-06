package com.creational.factory.example1;

import javax.annotation.Resource;

import com.creational.factory.example1.service.CurrencyService;

public class CurrencyServiceFactory {

    @Resource
    private CurrencyService rupeeCurrencyService;

    @Resource
    private CurrencyService canadianDollarCurrencyService;

    @Resource
    private CurrencyService usDollarCurrencyService;

    public CurrencyService getCurrencyObject(String country) {
        if (country.equalsIgnoreCase("India")) {
            return rupeeCurrencyService;
        } else if (country.equalsIgnoreCase("CANADA")) {
            return canadianDollarCurrencyService;
        } else if (country.equalsIgnoreCase("US")) {
            return usDollarCurrencyService;
        }
        throw new IllegalArgumentException("No such currency");
    }
}
