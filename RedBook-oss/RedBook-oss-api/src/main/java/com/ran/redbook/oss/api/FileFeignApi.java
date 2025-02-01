package com.ran.redbook.oss.api;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.oss.constant.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: ran
 * @date: 2024/4/13 22:56
 * @version: v1.0.0
 * @description: TODO
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface FileFeignApi {

    String PREFIX = "/file";

    @PostMapping(value = PREFIX + "/test")
    Response<?> test();

}
