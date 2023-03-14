package com.bujreny.blog.vo.params;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@Data
public class LoginParams {
    private String account;
    private String password;
    private String nickname;
}
