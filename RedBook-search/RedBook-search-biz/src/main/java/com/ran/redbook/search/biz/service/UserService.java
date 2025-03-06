package com.ran.redbook.search.biz.service;

import com.RedBook.framework.common.response.PageResponse;
import com.RedBook.framework.common.response.Response;
import com.ran.redbook.search.dto.RebuildUserDocumentReqDTO;
import com.ran.redbook.search.biz.model.vo.SearchUserReqVO;
import com.ran.redbook.search.biz.model.vo.SearchUserRspVO;

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

    /**
     * 重建用户文档
     * @param rebuildUserDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO);
}
