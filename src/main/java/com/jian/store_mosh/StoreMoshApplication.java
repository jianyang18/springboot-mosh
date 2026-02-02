package com.jian.store_mosh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreMoshApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreMoshApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendNotification("this is a message");

    }

}
