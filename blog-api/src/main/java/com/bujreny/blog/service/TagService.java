package com.bujreny.blog.service;

import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    /**
     * 查询最热文章标签
     * @param limit
     * @return
     */

    Result hot(int limit);

    /**
     * 查询所有文章标签
     * @return
     */
    Result findAll();

    /**
     * 查询所有文章标签详情
     * @return
     */
    Result findAllDetail();

    /**
     * 通过 id 查询文章标签详情
     * @param id
     * @return
     */
    Result findDetailById(Long id);
}
