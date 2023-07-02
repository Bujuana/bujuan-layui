package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysOrgEntity;
import com.taoyuan.system.query.SysOrgQuery;
import com.taoyuan.system.vo.SysOrgVO;

import java.util.List;

/**
 * 机构管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysOrgService extends BaseService<SysOrgEntity> {

    PageResult<SysOrgVO> page(SysOrgQuery query);

    void save(SysOrgVO vo);

    void update(SysOrgVO vo);

    void delete(List<Long> idList);
}