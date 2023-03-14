package com.bujreny.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bujreny.blog.dao.dos.Archives;
import com.bujreny.blog.dao.pojo.Article;

import java.util.List;


public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();

    IPage<Article> listArticle(Page<Article> page,
                               String categoryId,
                               String tagId,
                               String year,
                               String month);
}
