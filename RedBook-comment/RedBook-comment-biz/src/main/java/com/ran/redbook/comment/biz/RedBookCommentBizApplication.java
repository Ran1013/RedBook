package com.ran.redbook.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.comment.biz.domain.mapper")
public class RedBookCommentBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedBookCommentBizApplication.class, args);
    }
}
