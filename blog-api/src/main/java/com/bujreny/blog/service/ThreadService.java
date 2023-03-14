package com.bujreny.blog.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.bujreny.blog.dao.mapper.ArticleMapper;
import com.bujreny.blog.dao.pojo.Article;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
@Component
public class ThreadService {
    // 期望此线程在线程池执行不会影响原有主线程
    @Async("tackExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {
        int viewCounts = article.getViewCounts();
        Article articleUpdate = new Article();
        articleUpdate.setViewCounts(viewCounts + 1);
        LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Article::getId, article.getId());
        // 为了再多线程环境下 线程安全
        updateWrapper.eq(Article::getViewCounts, viewCounts);

        articleMapper.update(articleUpdate, updateWrapper);


    }
}
