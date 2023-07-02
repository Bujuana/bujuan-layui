package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysPostEntity;
import com.taoyuan.system.query.SysPostQuery;
import com.taoyuan.system.vo.SysPostVO;

import java.util.List;

/**
 * 岗位管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysPostService extends BaseService<SysPostEntity> {

    PageResult<SysPostVO> page(SysPostQuery query);

    void save(SysPostVO vo);

    void update(SysPostVO vo);

    void delete(List<Long> idList);
}