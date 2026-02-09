package com.jian.store_mosh;

import com.jian.store_mosh.entitites.Address;
import com.jian.store_mosh.entitites.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreMoshApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreMoshApplication.class, args);

        var user = User.builder()
                .name("john")
                .password("password")
                .email("email")
                .build();

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }

}
