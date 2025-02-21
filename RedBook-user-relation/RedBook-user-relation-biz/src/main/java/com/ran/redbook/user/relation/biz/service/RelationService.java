package com.ran.redbook.user.relation.biz.service;

import com.RedBook.framework.common.response.PageResponse;
import com.RedBook.framework.common.response.Response;
import com.ran.redbook.user.relation.biz.model.vo.FindFollowingListReqVO;
import com.ran.redbook.user.relation.biz.model.vo.FindFollowingUserRspVO;
import com.ran.redbook.user.relation.biz.model.vo.FollowUserReqVO;
import com.ran.redbook.user.relation.biz.model.vo.UnfollowUserReqVO;


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
    /**
     * 取关用户
     * @param unfollowUserReqVO
     * @return
     */
    Response<?> unfollow(UnfollowUserReqVO unfollowUserReqVO);
    /**
     * 查询关注列表
     * @param findFollowingListReqVO
     * @return
     */
    PageResponse<FindFollowingUserRspVO> findFollowingList(FindFollowingListReqVO findFollowingListReqVO);

}


