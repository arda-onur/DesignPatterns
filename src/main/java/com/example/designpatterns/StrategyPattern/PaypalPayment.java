package com.example.designpatterns.StrategyPattern;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PaypalPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Paid by Paypal";
    }
}
