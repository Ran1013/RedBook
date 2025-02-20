package com.ran.redbook.user.relation.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.user.relation.biz.model.vo.FollowUserReqVO;


/**
 * 关注业务
 **/
public interface RelationService {

    /**
     * 关注用户
     * @param followUserReqVO
     * @return
     */
    Response<?> follow(FollowUserReqVO followUserReqVO);

}

