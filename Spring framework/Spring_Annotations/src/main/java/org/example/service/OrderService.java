package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private  NotificationService notification;

    public OrderService(){

    }

    @Autowired
    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void order(){
        System.out.println("Order placed.");
        notification.send();
    }
}
