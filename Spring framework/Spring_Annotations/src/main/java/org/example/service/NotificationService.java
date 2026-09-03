package org.example.service;


import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void send(){
        System.out.println("Notification alert.");
    }
}
