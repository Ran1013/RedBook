package com.ran.redbook.kv.biz.service;

import com.RedBook.framework.common.response.Response;
import com.ran.redbook.kv.dto.req.AddNoteContentReqDTO;
import com.ran.redbook.kv.dto.req.DeleteNoteContentReqDTO;
import com.ran.redbook.kv.dto.req.FindNoteContentReqDTO;
import com.ran.redbook.kv.dto.rsp.FindNoteContentRspDTO;

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

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);

}
