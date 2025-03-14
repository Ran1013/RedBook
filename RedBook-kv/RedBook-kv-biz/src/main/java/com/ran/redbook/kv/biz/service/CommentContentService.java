package com.ran.redbook.kv.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.kv.dto.req.BatchAddCommentContentReqDTO;
import com.ran.redbook.kv.dto.req.BatchFindCommentContentReqDTO;
import com.ran.redbook.kv.dto.req.DeleteCommentContentReqDTO;

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

    /**
     * 批量查询评论内容
     * @param batchFindCommentContentReqDTO
     * @return
     */
    Response<?> batchFindCommentContent(BatchFindCommentContentReqDTO batchFindCommentContentReqDTO);

    /**
     * 删除评论内容
     * @param deleteCommentContentReqDTO
     * @return
     */
    Response<?> deleteCommentContent(DeleteCommentContentReqDTO deleteCommentContentReqDTO);
}
