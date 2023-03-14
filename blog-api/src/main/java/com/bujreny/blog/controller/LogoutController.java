package com.bujreny.blog.controller;

import com.bujreny.blog.service.SSOService;
import com.bujreny.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@RestController
@RequestMapping("logout")
public class LogoutController {
    @Autowired
    private SSOService SSOService;
    @GetMapping
    public Result logout(@RequestHeader("Authorization") String token) {
        return SSOService.logout(token);
    }
}
