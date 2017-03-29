package com.github.dhoucgitter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRedisHttpSession
@SpringBootApplication
public class StockSpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(StockSpringBootStarter.class, args);
    }
}