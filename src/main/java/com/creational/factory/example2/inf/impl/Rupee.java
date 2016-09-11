package com.creational.factory.example2.inf.impl;

import com.creational.factory.example2.inf.Currency;

/**
 * @author
 * @version
 */
public class Rupee implements Currency {
    @Override
    public String getSymbol() {
        return "Rs";
    }

}
