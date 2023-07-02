package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 操作日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_log_operate")
public class SysLogOperateEntity extends BaseEntity {

    /**
     * 模块名
     */
    private String module;

    /**
     * 操作名
     */
    private String name;

    /**
     * 请求URI
     */
    private String reqUri;

    /**
     * 请求方法
     */
    private String reqMethod;

    /**
     * 请求参数
     */
    private String reqParams;

    /**
     * 操作IP
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
     * 操作类型
     */
    private Integer operateType;

    /**
     * 执行时长
     */
    private Integer duration;

    /**
     * 操作状态  0：失败   1：成功
     */
    private Integer status;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 操作人
     */
    private String realName;

    /**
     * 返回消息
     */
    private String resultMsg;


}