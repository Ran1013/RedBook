package com.ran.redbook.comment.biz.service;

import com.RedBook.framework.common.response.PageResponse;
import com.RedBook.framework.common.response.Response;
import com.ran.redbook.comment.biz.model.vo.FindCommentItemRspVO;
import com.ran.redbook.comment.biz.model.vo.FindCommentPageListReqVO;
import com.ran.redbook.comment.biz.model.vo.PublishCommentReqVO;

/**
 *  评论业务
 **/
public interface CommentService {

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response<?> publishComment(PublishCommentReqVO publishCommentReqVO);
    /**
     * 评论列表分页查询
     * @param findCommentPageListReqVO
     * @return
     */
    PageResponse<FindCommentItemRspVO> findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);
}
