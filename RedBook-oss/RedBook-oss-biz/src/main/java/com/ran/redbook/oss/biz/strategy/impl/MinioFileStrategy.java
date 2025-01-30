package com.ran.redbook.oss.biz.strategy.impl;

import com.ran.redbook.oss.biz.strategy.FileStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

/**
 * Minio 策略类
 */
@Slf4j
public class MinioFileStrategy implements FileStrategy {

    @Override
    public String uploadFile(MultipartFile file, String bucketName) {
        log.info("## 上传文件至 Minio ...");
        return null;
    }
}

