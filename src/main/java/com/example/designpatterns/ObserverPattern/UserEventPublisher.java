package com.example.designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class UserEventPublisher {
    private final List<UserRegisteredObserver> observerList = new ArrayList<>();

    public void addObserver(UserRegisteredObserver observer){
        observerList.add(observer);
    }

    public void publish(UserCreatedEvent event){
        for(UserRegisteredObserver obs: observerList){
            obs.handle(event);
        }

    }
}
