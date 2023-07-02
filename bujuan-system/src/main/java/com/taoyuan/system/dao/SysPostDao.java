package com.taoyuan.system.dao;

import com.taoyuan.framework.mybatis.dao.BaseDao;
import com.taoyuan.system.entity.SysPostEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 岗位管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysPostDao extends BaseDao<SysPostEntity> {

}