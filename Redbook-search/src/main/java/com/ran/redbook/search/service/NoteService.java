package com.ran.redbook.search.service;

import com.RedBook.framework.common.response.PageResponse;
import com.ran.redbook.search.model.vo.SearchNoteReqVO;
import com.ran.redbook.search.model.vo.SearchNoteRspVO;

/**
 *  笔记搜索业务
 **/
public interface NoteService {

    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);
}
