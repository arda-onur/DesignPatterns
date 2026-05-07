package com.example.designpatterns.ObserverPattern;

public interface UserRegisteredObserver {
    void handle(UserCreatedEvent userCreatedEvent);
}
