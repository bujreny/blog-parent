package com.bujreny.blog.service;

import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.params.ArticleParam;
import com.bujreny.blog.vo.params.PageParams;

public interface ArticleService {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticles(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticle(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param id
     * @return
     */
    Result findArticleById(Long id);

    /**
     * 文章发表
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);
}
