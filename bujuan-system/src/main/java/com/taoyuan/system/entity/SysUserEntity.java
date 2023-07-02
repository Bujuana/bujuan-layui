package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-27
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_user")
public class SysUserEntity extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别   0：男   1：女   2：未知
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 机构ID
     */
    private Long orgId;

    /**
     * 超级管理员   0：否   1：是
     */
    private Integer superAdmin;

    /**
     * 状态  0：停用   1：正常
     */
    private Integer status;

    /**
     * 最后登录的时间
     */
    private Date lastLoginData;

    /**
     * 最后登录的IP
     */
    private String lastLoginIp;


}