package com.bujreny.blog.dao.pojo;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
@Data
public class Comment {
    private Long id;
    private String content;
    private Long createDate;
    private Long articleId;
    private Long authorId;
    private Long parentId;
    private Long toUid;
    private Integer level;
}
