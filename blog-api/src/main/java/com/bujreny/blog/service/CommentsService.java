package com.bujreny.blog.service;

import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章Id获取评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    /**
     * 评论
     * @param commentParam
     * @return
     */
    Result comment(CommentParam commentParam);
}
