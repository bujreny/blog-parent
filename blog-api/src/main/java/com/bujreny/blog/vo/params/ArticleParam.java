package com.bujreny.blog.vo.params;

import com.bujreny.blog.dao.pojo.Category;
import com.bujreny.blog.vo.TagVo;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/12
 */
@Data
public class ArticleParam {
    private Long id;
    private ArticleBodyParam body;
    private Category category;
    private String summary;
    private List<TagVo> tags;
    private  String title;
}
