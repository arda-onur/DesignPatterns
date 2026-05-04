package com.example.designpatterns.StrategyPattern;

import org.springframework.stereotype.Component;

@Component("creditcart")
public class CreditCartPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Paid by credit card";
    }
}
