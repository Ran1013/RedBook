package com.ran.redbook.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ran
 */
@SpringBootApplication
@MapperScan("com.ran.redbook.auth.domain.mapper")
@EnableFeignClients(basePackages = "com.ran.redbook")
public class RedBookAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookAuthApplication.class, args);
    }

}
