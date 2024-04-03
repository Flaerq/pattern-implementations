package com.example.patternimplementations;

import com.example.patternimplementations.observer.NotificationManager;
import com.example.patternimplementations.observer.PaymentEventLogger;
import com.example.patternimplementations.observer.PaymentManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternImplementationsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PatternImplementationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
