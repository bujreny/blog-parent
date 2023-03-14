package com.bujreny.blog.controller;

import com.bujreny.blog.dao.pojo.SysUser;
import com.bujreny.blog.utils.UserThreadLocal;
import com.bujreny.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public Result test() {
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
