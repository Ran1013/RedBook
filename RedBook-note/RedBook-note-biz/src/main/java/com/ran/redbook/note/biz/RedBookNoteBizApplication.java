package com.ran.redbook.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.note.biz.domain.mapper")
public class RedBookNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookNoteBizApplication.class, args);
    }

}
