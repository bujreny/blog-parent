package com.bujreny.blog.vo.params;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/12
 */
@Data
public class CommentParam {
    private String articleId;
    private String content;
    private String parent;
    private String toUserId;

}
