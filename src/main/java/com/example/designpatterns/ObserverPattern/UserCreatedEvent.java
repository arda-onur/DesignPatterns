package com.example.designpatterns.ObserverPattern;

public class UserCreatedEvent {
    private String email;

    public UserCreatedEvent(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
