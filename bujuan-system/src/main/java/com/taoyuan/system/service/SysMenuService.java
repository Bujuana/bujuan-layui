package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysMenuEntity;
import com.taoyuan.system.query.SysMenuQuery;
import com.taoyuan.system.vo.SysMenuVO;

import java.util.List;

/**
 * 菜单管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysMenuService extends BaseService<SysMenuEntity> {

    PageResult<SysMenuVO> page(SysMenuQuery query);

    void save(SysMenuVO vo);

    void update(SysMenuVO vo);

    void delete(List<Long> idList);
}