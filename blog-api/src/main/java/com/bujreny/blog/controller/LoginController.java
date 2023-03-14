package com.bujreny.blog.controller;

import com.bujreny.blog.service.SSOService;
import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private SSOService SSOService;
    @PostMapping
    public Result login(@RequestBody LoginParams loginParams) {
        // 登录 验证用户 访问数据表 但是不用SysUserService
        return SSOService.login(loginParams);
    }

}
