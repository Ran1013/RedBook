package com.ran.redbook.user.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.user.biz.model.vo.UpdateUserInfoReqVO;
import com.ran.redbook.user.dto.req.RegisterUserReqDTO;

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

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);
}
