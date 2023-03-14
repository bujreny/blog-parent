package com.bujreny.blog.service;

import com.bujreny.blog.dao.pojo.SysUser;
import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.UserVo;

public interface SysUserService {
    SysUser findUser(String account, String password);

    SysUser findUserById(Long id);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账号查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);

    UserVo findUserVoById(Long id);
}
