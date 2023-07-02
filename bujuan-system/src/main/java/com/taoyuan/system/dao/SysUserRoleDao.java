package com.taoyuan.system.dao;

import com.taoyuan.framework.mybatis.dao.BaseDao;
import com.taoyuan.system.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

}