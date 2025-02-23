package com.ran.redbook.count.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.count.biz.domain.mapper")
public class RedBookCountBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedBookCountBizApplication.class, args);
    }

}
