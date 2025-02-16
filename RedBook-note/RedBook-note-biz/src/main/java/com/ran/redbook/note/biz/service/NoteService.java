package com.ran.redbook.note.biz.service;


import com.RedBook.framework.common.response.Response;
import com.ran.redbook.note.biz.model.vo.FindNoteDetailReqVO;
import com.ran.redbook.note.biz.model.vo.FindNoteDetailRspVO;
import com.ran.redbook.note.biz.model.vo.PublishNoteReqVO;
import com.ran.redbook.note.biz.model.vo.UpdateNoteReqVO;

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

    /**
     * 笔记详情
     * @param findNoteDetailReqVO
     * @return
     */
    Response<FindNoteDetailRspVO> findNoteDetail(FindNoteDetailReqVO findNoteDetailReqVO);

    /**
     * 笔记更新
     * @param updateNoteReqVO
     * @return
     */
    Response<?> updateNote(UpdateNoteReqVO updateNoteReqVO);
}
