package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysOrgConvert;
import com.taoyuan.system.dao.SysOrgDao;
import com.taoyuan.system.entity.SysOrgEntity;
import com.taoyuan.system.query.SysOrgQuery;
import com.taoyuan.system.service.SysOrgService;
import com.taoyuan.system.vo.SysOrgVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 机构管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysOrgServiceImpl extends BaseServiceImpl<SysOrgDao, SysOrgEntity> implements SysOrgService {

    @Override
    public PageResult<SysOrgVO> page(SysOrgQuery query) {
        IPage<SysOrgEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysOrgConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysOrgEntity> getWrapper(SysOrgQuery query) {
        LambdaQueryWrapper<SysOrgEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysOrgVO vo) {
        SysOrgEntity entity = SysOrgConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysOrgVO vo) {
        SysOrgEntity entity = SysOrgConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}