package com.bujreny.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
@Data
public class CategoryVo {
    //防止前前端精度损失
//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private String avatar;
    private String categoryName;
    private String description;
}
