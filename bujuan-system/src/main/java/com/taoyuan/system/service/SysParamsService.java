package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysParamsEntity;
import com.taoyuan.system.query.SysParamsQuery;
import com.taoyuan.system.vo.SysParamsVO;

import java.util.List;

/**
 * 参数管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysParamsService extends BaseService<SysParamsEntity> {

    PageResult<SysParamsVO> page(SysParamsQuery query);

    void save(SysParamsVO vo);

    void update(SysParamsVO vo);

    void delete(List<Long> idList);
}