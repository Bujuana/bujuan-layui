package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysUserRoleEntity;
import com.taoyuan.system.query.SysUserRoleQuery;
import com.taoyuan.system.vo.SysUserRoleVO;

import java.util.List;

/**
 * 用户角色关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysUserRoleService extends BaseService<SysUserRoleEntity> {

    PageResult<SysUserRoleVO> page(SysUserRoleQuery query);

    void save(SysUserRoleVO vo);

    void update(SysUserRoleVO vo);

    void delete(List<Long> idList);
}