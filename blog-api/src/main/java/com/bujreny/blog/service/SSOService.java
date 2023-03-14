package com.bujreny.blog.service;

import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.params.LoginParams;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
//事务注解，确保注册时出现问题数据回滚
@Transactional
public interface SSOService {

    /**
     * 登录功能
     * @param loginParams
     * @return
     */
    Result login(LoginParams loginParams);

    /**
     * 退出
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     * @param loginParams
     * @return
     */
    Result register(LoginParams loginParams);
}
