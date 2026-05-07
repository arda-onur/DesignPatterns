package com.example.designpatterns.FactoryPattern;

import com.example.designpatterns.StrategyPattern.CreditCartPayment;
import com.example.designpatterns.StrategyPattern.CryptoPayment;
import com.example.designpatterns.StrategyPattern.PaymentStrategy;
import com.example.designpatterns.StrategyPattern.PaypalPayment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {

    public PaymentStrategy create(String type){
        return switch (type){
            case "credit" -> new CreditCartPayment();
            case "crypto" -> new CryptoPayment();
            case "paypal" -> new PaypalPayment();
            default -> throw new IllegalArgumentException("Invalid Type");
        };
    }
}
