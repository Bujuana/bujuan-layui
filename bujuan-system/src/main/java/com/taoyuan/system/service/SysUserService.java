package com.taoyuan.system.service;


import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysUserEntity;
import com.taoyuan.system.query.SysUserQuery;
import com.taoyuan.system.vo.SysUserVO;

import java.util.List;

/**
 * 用户管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-27
 */
public interface SysUserService extends BaseService<SysUserEntity> {

    PageResult<SysUserVO> page(SysUserQuery query);

    void save(SysUserVO vo);

    void update(SysUserVO vo);

    void delete(List<Long> idList);
}