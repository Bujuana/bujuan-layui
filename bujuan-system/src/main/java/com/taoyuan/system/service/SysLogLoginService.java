package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysLogLoginEntity;
import com.taoyuan.system.query.SysLogLoginQuery;
import com.taoyuan.system.vo.SysLogLoginVO;

import java.util.List;

/**
 * 登录日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    PageResult<SysLogLoginVO> page(SysLogLoginQuery query);

    void save(SysLogLoginVO vo);

    void update(SysLogLoginVO vo);

    void delete(List<Long> idList);
}