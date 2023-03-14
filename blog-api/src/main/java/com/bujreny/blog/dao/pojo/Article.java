package com.bujreny.blog.dao.pojo;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
@Data
public class Article {
    public static final int Article_TOP = 1;
    public static final int Article_Common = 0;
    private Long id;
    private String title;
    private String summary;
    private Integer commentCounts;
    private Integer viewCounts;

    //作者ID
    private Long authorId;
    //内容ID
    private Long bodyId;
    //类别ID
    private Long categoryId;
    //置顶
    private Integer weight;

    //创建时间
    private Long createDate;

}
