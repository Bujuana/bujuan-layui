package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysUserPostConvert;
import com.taoyuan.system.dao.SysUserPostDao;
import com.taoyuan.system.entity.SysUserPostEntity;
import com.taoyuan.system.query.SysUserPostQuery;
import com.taoyuan.system.service.SysUserPostService;
import com.taoyuan.system.vo.SysUserPostVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysUserPostServiceImpl extends BaseServiceImpl<SysUserPostDao, SysUserPostEntity> implements SysUserPostService {

    @Override
    public PageResult<SysUserPostVO> page(SysUserPostQuery query) {
        IPage<SysUserPostEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysUserPostConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysUserPostEntity> getWrapper(SysUserPostQuery query) {
        LambdaQueryWrapper<SysUserPostEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysUserPostVO vo) {
        SysUserPostEntity entity = SysUserPostConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysUserPostVO vo) {
        SysUserPostEntity entity = SysUserPostConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}