package com.taoyuan.system.service;


import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysRoleEntity;
import com.taoyuan.system.query.SysRoleQuery;
import com.taoyuan.system.vo.SysRoleVO;

import java.util.List;

/**
 * 角色管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

    PageResult<SysRoleVO> page(SysRoleQuery query);

    void save(SysRoleVO vo);

    void update(SysRoleVO vo);

    void delete(List<Long> idList);
}