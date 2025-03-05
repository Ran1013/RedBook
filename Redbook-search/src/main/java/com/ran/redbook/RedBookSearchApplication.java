package com.ran.redbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RedBookSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookSearchApplication.class, args);
    }

}

