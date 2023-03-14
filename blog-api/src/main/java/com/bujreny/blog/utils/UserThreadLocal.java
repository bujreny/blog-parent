package com.bujreny.blog.utils;

import com.bujreny.blog.dao.pojo.SysUser;

/**
 * @author Administrator
 * @description 线程变量隔离
 * @date 2023/3/10
 */
public class UserThreadLocal {
    private UserThreadLocal(){}
    private static final ThreadLocal<SysUser> LOCAL = new ThreadLocal<>();

    public static void put(SysUser sysUser) {
        LOCAL.set(sysUser);
    }

    public static SysUser get() {
        return LOCAL.get();
    }

    public static void remove() {
        LOCAL.remove();
    }


}
