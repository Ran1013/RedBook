package com.ran.redbook.kv.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.kv.dto.req.AddNoteContentReqDTO;

/**
 * 笔记内容存储业务
 **/
public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);

}
