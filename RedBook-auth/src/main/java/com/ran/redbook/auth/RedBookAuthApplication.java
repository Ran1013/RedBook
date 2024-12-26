package com.ran.redbook.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.auth.domain.mapper")
public class RedBookAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookAuthApplication.class, args);
    }

}
