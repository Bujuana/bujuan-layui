package com.taoyuan.system.dao;

import com.taoyuan.framework.mybatis.dao.BaseDao;
import com.taoyuan.system.entity.SysUserPostEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysUserPostDao extends BaseDao<SysUserPostEntity> {

}