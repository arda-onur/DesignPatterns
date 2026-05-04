package com.example.designpatterns;

import com.example.designpatterns.StrategyPattern.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class DesignPatternsApplication {
    private final PaymentService paymentService;
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            System.out.println(paymentService.pay("creditcart"));
        };
    }
}
