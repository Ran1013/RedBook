package com.ran.redbook.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.redbook.user.relation.biz.domain.mapper")
public class RedBookUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookUserRelationBizApplication.class, args);
    }

}
