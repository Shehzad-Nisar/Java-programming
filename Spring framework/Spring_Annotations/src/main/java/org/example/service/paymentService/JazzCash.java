package org.example.service.paymentService;


import org.springframework.stereotype.Component;

@Component
public class JazzCash implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using JazzCash");
    }
}
