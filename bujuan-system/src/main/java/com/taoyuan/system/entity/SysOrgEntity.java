package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 机构管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_org")
public class SysOrgEntity extends BaseEntity {

    /**
     * 上级ID
     */
    private Long pid;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;


}