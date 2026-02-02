package com.jian.store_mosh;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processOrder(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount: " + amount + " paid.");
    }
}
