package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 参数管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_params")
public class SysParamsEntity extends BaseEntity {

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 系统参数   0：否   1：是
     */
    private Integer paramType;

    /**
     * 参数键
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 备注
     */
    private String remark;


}