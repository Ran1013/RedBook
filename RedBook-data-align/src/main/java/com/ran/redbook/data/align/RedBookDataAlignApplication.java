package com.ran.redbook.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.data.align.domain.mapper")
public class RedBookDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookDataAlignApplication.class, args);
    }

}

