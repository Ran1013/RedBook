package com.ran.redbook.kv.api;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.kv.constant.ApiConstants;
import com.ran.redbook.kv.dto.req.AddNoteContentReqDTO;
import com.ran.redbook.kv.dto.req.FindNoteContentReqDTO;
import com.ran.redbook.kv.dto.rsp.FindNoteContentRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * K-V 键值存储 Feign 接口
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface KeyValueFeignApi {

    String PREFIX = "/kv";

    @PostMapping(value = PREFIX + "/note/content/add")
    Response<?> addNoteContent(@RequestBody AddNoteContentReqDTO addNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/find")
    Response<FindNoteContentRspDTO> findNoteContent(@RequestBody FindNoteContentReqDTO findNoteContentReqDTO);

}

