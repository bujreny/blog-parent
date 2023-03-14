package com.bujreny.blog.dao.pojo;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/12
 */
@Data
public class ArticleTag {
    private Long id;
    private Long articleId;
    private Long tagId;
}
