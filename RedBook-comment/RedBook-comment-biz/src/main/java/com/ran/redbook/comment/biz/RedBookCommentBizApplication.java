package com.ran.redbook.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@MapperScan("com.ran.redbook.comment.biz.domain.mapper")
@EnableRetry // 启用 Spring Retry
public class RedBookCommentBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedBookCommentBizApplication.class, args);
    }
}
