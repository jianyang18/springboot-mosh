package com.jian.store_mosh;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Override
    public void processOrder(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount + " paid.");
    }
}
