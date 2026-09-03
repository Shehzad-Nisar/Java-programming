package org.example.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.service.notificationService.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle {

    private final NotificationService notificationService;

    public BeanLifeCycle(NotificationService notificationService) {
        this.notificationService = notificationService;
        System.out.println("1. object is created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. Initialized.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("3. Destroyed.");
    }
}