package com.bujreny.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@Data
public class LoginUserVo {
    //防止前前端精度损失
    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private String account;
    private String nickname;
    private String avatar;

}
