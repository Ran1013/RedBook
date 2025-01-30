package com.ran.redbook.oss.biz.strategy.impl;

import com.ran.redbook.oss.biz.strategy.FileStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

/**
 * 阿里云OSS文件上传策略
 **/
@Slf4j
public class AliyunOSSFileStrategy implements FileStrategy {

    @Override
    public String uploadFile(MultipartFile file, String bucketName) {
        log.info("## 上传文件至阿里云 OSS ...");
        return null;
    }
}