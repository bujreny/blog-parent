package com.bujreny.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/12
 */
@Data
public class CommentVo {
    //防止前前端精度损失
//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private UserVo author;
    private String content;
    private List<CommentVo> childrens;
    private String createDate;
    private Integer level;
    private UserVo toUser;

}
