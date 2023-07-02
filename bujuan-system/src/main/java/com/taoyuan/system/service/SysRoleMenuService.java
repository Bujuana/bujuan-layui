package com.taoyuan.system.service;


import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysRoleMenuEntity;
import com.taoyuan.system.query.SysRoleMenuQuery;
import com.taoyuan.system.vo.SysRoleMenuVO;

import java.util.List;

/**
 * 角色菜单关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysRoleMenuService extends BaseService<SysRoleMenuEntity> {

    PageResult<SysRoleMenuVO> page(SysRoleMenuQuery query);

    void save(SysRoleMenuVO vo);

    void update(SysRoleMenuVO vo);

    void delete(List<Long> idList);
}