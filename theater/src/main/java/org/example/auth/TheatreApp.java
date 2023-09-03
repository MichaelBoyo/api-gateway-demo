package org.example.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"org.example.**"})
@EnableFeignClients(basePackages = "org.example.**")
public class TheatreApp {
    public static void main(String[] args) {
        SpringApplication.run(TheatreApp.class, args);
    }
}