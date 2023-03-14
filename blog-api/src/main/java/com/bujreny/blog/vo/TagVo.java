package com.bujreny.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */

@Data
public class TagVo {
    //防止前前端精度损失
//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private String tagName;
    private String avatar;
}
