package com.example.greeterspringbootsampleapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.greeter.springboot.autoconfigure.Greeter;

@SpringBootApplication
@Slf4j
public class GreeterSpringBootSampleAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GreeterSpringBootSampleAppApplication.class, args);
    }

    @Autowired
    Greeter greeter;

    @Override
    public void run(String... args) {
        log.info(greeter.greet());
    }
}
