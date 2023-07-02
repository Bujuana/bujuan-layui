package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色数据权限
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_role_data_scope")
public class SysRoleDataScopeEntity extends BaseEntity {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 机构ID
     */
    private Long orgId;


}