package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典类型
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_dict_type")
public class SysDictTypeEntity extends BaseEntity {

    /**
     * 字典类型
     */
    private String dictType;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 来源  0：字典数据  1：动态SQL
     */
    private Integer dictSource;

    /**
     * 动态SQL
     */
    private String dictSql;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序
     */
    private Integer sort;


}