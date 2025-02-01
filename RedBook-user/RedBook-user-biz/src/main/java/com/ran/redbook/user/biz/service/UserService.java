package com.ran.redbook.user.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.user.biz.model.vo.UpdateUserInfoReqVO;

/**
 * 用户业务
 **/
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);
}
