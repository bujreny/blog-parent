package com.bujreny.blog.service.impl;

import com.alibaba.fastjson2.JSON;
import com.bujreny.blog.dao.pojo.SysUser;
import com.bujreny.blog.service.TokenService;
import com.bujreny.blog.utils.JWTUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public SysUser checkToken(String token) {
        if (StringUtils.isBlank(token)) {
            return null;
        }
        Map<String, Object> stringObjectMap = JWTUtils.checkToken(token);
        if (stringObjectMap == null) {
            return null;
        }
        String userJson = redisTemplate.opsForValue().get("TOKEN_" + token).toString();
        if (StringUtils.isBlank(userJson)) {
            return null;
        }
        SysUser sysUser = JSON.parseObject(userJson, SysUser.class);

        return sysUser;
    }
}
