package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysDictDataEntity;
import com.taoyuan.system.query.SysDictDataQuery;
import com.taoyuan.system.vo.SysDictDataVO;

import java.util.List;

/**
 * 字典数据
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageResult<SysDictDataVO> page(SysDictDataQuery query);

    void save(SysDictDataVO vo);

    void update(SysDictDataVO vo);

    void delete(List<Long> idList);
}