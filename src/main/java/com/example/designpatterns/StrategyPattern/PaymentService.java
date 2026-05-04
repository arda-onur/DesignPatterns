package com.example.designpatterns.StrategyPattern;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentService(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public String pay(String type){
        PaymentStrategy paymentStrategy = paymentStrategies.get(type);

        if (paymentStrategy == null) {
            throw new RuntimeException("Invalid Type");
        }

        return paymentStrategy.pay();
    }
}
