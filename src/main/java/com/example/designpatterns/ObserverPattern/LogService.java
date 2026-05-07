package com.example.designpatterns.ObserverPattern;


public class LogService implements UserRegisteredObserver {
    @Override
    public void handle(UserCreatedEvent userCreatedEvent) {
        System.out.println("Logged email: " + userCreatedEvent.getEmail());
    }
}
