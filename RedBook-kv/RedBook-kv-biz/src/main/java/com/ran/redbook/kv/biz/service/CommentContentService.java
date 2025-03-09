package com.ran.redbook.kv.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.kv.dto.req.BatchAddCommentContentReqDTO;

/**
 * 评论内容存储业务
 **/
public interface CommentContentService {


    /**
     * 批量添加评论内容
     * @param batchAddCommentContentReqDTO
     * @return
     */
    Response<?> batchAddCommentContent(BatchAddCommentContentReqDTO batchAddCommentContentReqDTO);
}
