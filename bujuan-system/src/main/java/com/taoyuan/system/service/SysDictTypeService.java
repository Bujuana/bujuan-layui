package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysDictTypeEntity;
import com.taoyuan.system.query.SysDictTypeQuery;
import com.taoyuan.system.vo.SysDictTypeVO;

import java.util.List;

/**
 * 字典类型
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageResult<SysDictTypeVO> page(SysDictTypeQuery query);

    void save(SysDictTypeVO vo);

    void update(SysDictTypeVO vo);

    void delete(List<Long> idList);
}