package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色菜单关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_role_menu")
public class SysRoleMenuEntity extends BaseEntity {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;


}