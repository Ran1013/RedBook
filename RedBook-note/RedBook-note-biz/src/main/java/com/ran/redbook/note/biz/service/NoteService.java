package com.ran.redbook.note.biz.service;


import com.RedBook.framework.common.response.Response;
import com.ran.redbook.note.biz.model.vo.PublishNoteReqVO;

/**
 * 笔记业务
 **/
public interface NoteService {

    /**
     * 笔记发布
     *
     * @param publishNoteReqVO
     * @return
     */
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

}
