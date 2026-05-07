package com.example.designpatterns.ObserverPattern;

public class EmailService implements UserRegisteredObserver{
    @Override
    public void handle(UserCreatedEvent userCreatedEvent) {
        System.out.println("Sent email: " + userCreatedEvent.getEmail());
    }
}
