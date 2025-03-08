package com.ran.redbook.comment.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.comment.biz.model.vo.PublishCommentReqVO;

/**
 * 评论业务
 **/
public interface CommentService {

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response<?> publishComment(PublishCommentReqVO publishCommentReqVO);
}
