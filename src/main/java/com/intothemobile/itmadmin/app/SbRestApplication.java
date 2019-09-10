package com.intothemobile.itmadmin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.intothemobile.itmadmin"})
public class SbRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbRestApplication.class, args);
    }
}
