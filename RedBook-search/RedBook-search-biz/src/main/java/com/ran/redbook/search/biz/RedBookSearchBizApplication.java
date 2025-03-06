package com.ran.redbook.search.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.ran.redbook.search.biz.domain.mapper")
public class RedBookSearchBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookSearchBizApplication.class, args);
    }

}
