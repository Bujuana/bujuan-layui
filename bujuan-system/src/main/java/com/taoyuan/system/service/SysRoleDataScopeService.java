package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysRoleDataScopeEntity;
import com.taoyuan.system.query.SysRoleDataScopeQuery;
import com.taoyuan.system.vo.SysRoleDataScopeVO;

import java.util.List;

/**
 * 角色数据权限
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysRoleDataScopeService extends BaseService<SysRoleDataScopeEntity> {

    PageResult<SysRoleDataScopeVO> page(SysRoleDataScopeQuery query);

    void save(SysRoleDataScopeVO vo);

    void update(SysRoleDataScopeVO vo);

    void delete(List<Long> idList);
}