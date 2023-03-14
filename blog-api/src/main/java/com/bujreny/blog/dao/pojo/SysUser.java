package com.bujreny.blog.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
@Data
public class SysUser {
//    @TableId(type = IdType.ASSIGN_ID)// 默认id类型
    // 以后用户多了，要进行分表操作，id就需要分布式id了
//    @TableId(type = IdType.AUTO) 数据库自增id
    private Long id;
    private String account;
    private Integer admin;
    private String avatar;
    private Long CreateDate;
    private Integer deleted;
    private String email;
    private Long lastLogin;
    private String mobilePhoneNumber;
    private String nickname;
    private String password;
    private String salt;
    private String status;
}
