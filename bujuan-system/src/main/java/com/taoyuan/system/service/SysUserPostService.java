package com.taoyuan.system.service;


import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysUserPostEntity;
import com.taoyuan.system.query.SysUserPostQuery;
import com.taoyuan.system.vo.SysUserPostVO;

import java.util.List;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysUserPostService extends BaseService<SysUserPostEntity> {

    PageResult<SysUserPostVO> page(SysUserPostQuery query);

    void save(SysUserPostVO vo);

    void update(SysUserPostVO vo);

    void delete(List<Long> idList);
}