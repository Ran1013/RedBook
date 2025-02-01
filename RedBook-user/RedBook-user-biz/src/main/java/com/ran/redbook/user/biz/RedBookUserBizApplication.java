package com.ran.redbook.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.user.biz.domain.mapper")
public class RedBookUserBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedBookUserBizApplication.class, args);
    }
}
