package com.creational.factory.example1.service.impl;

import org.springframework.stereotype.Service;

import com.creational.factory.example1.service.CurrencyService;

/**
 * @author
 * @version
 */
@Service("canadianDollarCurrencyService")
public class CanadianDollarCurrencyServiceImpl implements CurrencyService {
    @Override
    public String getSymbol() {
        return "CAD";
    }

}
