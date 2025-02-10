package com.ran.redbook.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.ran.redbook.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.ran.redbook")
public class RedBookNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookNoteBizApplication.class, args);
    }

}
