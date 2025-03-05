package com.ran.redbook.search.service;

import com.RedBook.framework.common.response.PageResponse;
import com.ran.redbook.search.model.vo.SearchUserReqVO;
import com.ran.redbook.search.model.vo.SearchUserRspVO;

/**
 *  用户搜索业务
 **/
public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);
}
