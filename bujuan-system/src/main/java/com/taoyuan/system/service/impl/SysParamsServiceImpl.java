package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysParamsConvert;
import com.taoyuan.system.dao.SysParamsDao;
import com.taoyuan.system.entity.SysParamsEntity;
import com.taoyuan.system.query.SysParamsQuery;
import com.taoyuan.system.service.SysParamsService;
import com.taoyuan.system.vo.SysParamsVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 参数管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysParamsServiceImpl extends BaseServiceImpl<SysParamsDao, SysParamsEntity> implements SysParamsService {

    @Override
    public PageResult<SysParamsVO> page(SysParamsQuery query) {
        IPage<SysParamsEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysParamsConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysParamsEntity> getWrapper(SysParamsQuery query) {
        LambdaQueryWrapper<SysParamsEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysParamsVO vo) {
        SysParamsEntity entity = SysParamsConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysParamsVO vo) {
        SysParamsEntity entity = SysParamsConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}