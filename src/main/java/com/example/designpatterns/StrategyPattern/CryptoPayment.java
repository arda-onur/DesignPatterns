package com.example.designpatterns.StrategyPattern;

import org.springframework.stereotype.Component;

@Component("crypto")
public class CryptoPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Paid by Crypto";
    }
}