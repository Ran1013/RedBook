package com.ran.redbook.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@MapperScan("com.ran.redbook.data.align.domain.mapper")
@EnableFeignClients(basePackages = "com.ran.redbook")
public class RedBookDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookDataAlignApplication.class, args);
    }

}

