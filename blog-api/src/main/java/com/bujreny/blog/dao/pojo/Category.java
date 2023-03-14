package com.bujreny.blog.dao.pojo;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
@Data
public class Category {
    private Long id;
    private String avatar;
    private String categoryName;
    private String description;
}
