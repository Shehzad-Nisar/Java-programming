package org.example.service.paymentService;


import org.springframework.stereotype.Component;

@Component
public class EasyPaisa implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using EasyPaisa.");    }
}
