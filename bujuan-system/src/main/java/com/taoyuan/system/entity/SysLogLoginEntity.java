package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 登录日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_log_login")
public class SysLogLoginEntity extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录IP
     */
    private String ip;

    /**
     * 登录地点
     */
    private String address;

    /**
     * User Agent
     */
    private String userAgent;

    /**
     * 登录状态  0：失败   1：成功
     */
    private Integer status;

    /**
     * 操作信息   0：登录成功   1：退出成功  2：验证码错误  3：账号密码错误
     */
    private Integer operation;


}