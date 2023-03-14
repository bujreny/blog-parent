package com.bujreny.blog.dao.pojo;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
@Data
public class ArticleBody {
    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;
}
