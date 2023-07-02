package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysMenuConvert;
import com.taoyuan.system.dao.SysMenuDao;
import com.taoyuan.system.entity.SysMenuEntity;
import com.taoyuan.system.query.SysMenuQuery;
import com.taoyuan.system.service.SysMenuService;
import com.taoyuan.system.vo.SysMenuVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 菜单管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

    @Override
    public PageResult<SysMenuVO> page(SysMenuQuery query) {
        IPage<SysMenuEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysMenuConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysMenuEntity> getWrapper(SysMenuQuery query) {
        LambdaQueryWrapper<SysMenuEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysMenuVO vo) {
        SysMenuEntity entity = SysMenuConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysMenuVO vo) {
        SysMenuEntity entity = SysMenuConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}