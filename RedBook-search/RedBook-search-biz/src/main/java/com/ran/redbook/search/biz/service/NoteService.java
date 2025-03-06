package com.ran.redbook.search.biz.service;

import com.RedBook.framework.common.response.PageResponse;
import com.RedBook.framework.common.response.Response;
import com.ran.redbook.search.dto.RebuildNoteDocumentReqDTO;
import com.ran.redbook.search.biz.model.vo.SearchNoteReqVO;
import com.ran.redbook.search.biz.model.vo.SearchNoteRspVO;

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

    /**
     * 重建笔记文档
     * @param rebuildNoteDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO);
}
