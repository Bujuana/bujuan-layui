package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysLogOperateEntity;
import com.taoyuan.system.query.SysLogOperateQuery;
import com.taoyuan.system.vo.SysLogOperateVO;

import java.util.List;

/**
 * 操作日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysLogOperateService extends BaseService<SysLogOperateEntity> {

    PageResult<SysLogOperateVO> page(SysLogOperateQuery query);

    void save(SysLogOperateVO vo);

    void update(SysLogOperateVO vo);

    void delete(List<Long> idList);
}