package com.taoyuan.system.dao;

import com.taoyuan.framework.mybatis.dao.BaseDao;
import com.taoyuan.system.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-27
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {

}