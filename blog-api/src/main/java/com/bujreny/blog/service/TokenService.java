package com.bujreny.blog.service;

import com.bujreny.blog.dao.pojo.SysUser;

public interface TokenService {
    SysUser checkToken(String token);
}
