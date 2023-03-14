package com.bujreny.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bujreny.blog.dao.mapper.SysUserMapper;
import com.bujreny.blog.dao.pojo.SysUser;
import com.bujreny.blog.service.SysUserService;
import com.bujreny.blog.service.TokenService;
import com.bujreny.blog.vo.ErrorCode;
import com.bujreny.blog.vo.LoginUserVo;
import com.bujreny.blog.vo.Result;
import com.bujreny.blog.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private TokenService tokenService;



    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("bujreny");
        }
        return sysUser;
    }

    @Override
    public UserVo findUserVoById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        UserVo userVo = new UserVo();
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("bujreny");
        }
        BeanUtils.copyProperties(sysUser, userVo);
        userVo.setId(String.valueOf(sysUser.getId()));

        return userVo;
    }

    @Override
    public SysUser findUser(String account, String password) {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getAccount, account);
        queryWrapper.eq(SysUser::getPassword, password);
        queryWrapper.select(SysUser::getAccount, SysUser::getId, SysUser::getAvatar, SysUser::getNickname);
        queryWrapper.last("limit 1");
        return sysUserMapper.selectOne(queryWrapper);
    }



    @Override
    public Result findUserByToken(String token) {
        /**
         * 1. token合法性效验
         *      是否为空 解析是否成功 Redis是否存在
         * 2. 如果校验失败，返回错误
         * 3. 如果校验成功返回对应结果 LoginUserVo
         */
        SysUser sysUser = tokenService.checkToken(token);
        if (sysUser == null) {
            return Result.fail(ErrorCode.TOKEN_ERROR.getCode(), ErrorCode.TOKEN_ERROR.getMsg());
        }
        LoginUserVo loginUserVo = new LoginUserVo();
        loginUserVo.setId(String.valueOf(sysUser.getId()));
        loginUserVo.setAvatar(sysUser.getAvatar());
        loginUserVo.setAccount(sysUser.getAccount());
        return Result.success(loginUserVo);
    }

    @Override
    public SysUser findUserByAccount(String account) {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getAccount, account);
        queryWrapper.last("limit 1");

        return sysUserMapper.selectOne(queryWrapper);
    }

    @Override
    public void save(SysUser sysUser) {
        // 保存用户id会自动生成
        // 这个地方默认生成id为分布式id 雪花算法
        // mybatis-plus

        sysUserMapper.insert(sysUser);

    }
}
