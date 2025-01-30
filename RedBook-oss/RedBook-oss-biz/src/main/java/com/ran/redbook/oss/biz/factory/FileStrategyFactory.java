package com.ran.redbook.oss.biz.factory;

import com.ran.redbook.oss.biz.strategy.FileStrategy;
import com.ran.redbook.oss.biz.strategy.impl.AliyunOSSFileStrategy;
import com.ran.redbook.oss.biz.strategy.impl.MinioFileStrategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class FileStrategyFactory {
    //根据配置文件的类型来选择策略
    @Value("${storage.type}")
    private String strategyType;

    //根据类型来选择策略
    @Bean
    @RefreshScope
    public FileStrategy getFileStrategy() {
        if (StringUtils.equals(strategyType, "minio")) {
            return new MinioFileStrategy();
        } else if (StringUtils.equals(strategyType, "aliyun")) {
            return new AliyunOSSFileStrategy();
        }

        throw new IllegalArgumentException("不可用的存储类型");
    }

}
