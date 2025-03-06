package com.ran.redbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.ran.redbook.search.domain.mapper")
public class RedBookSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookSearchApplication.class, args);
    }

}

