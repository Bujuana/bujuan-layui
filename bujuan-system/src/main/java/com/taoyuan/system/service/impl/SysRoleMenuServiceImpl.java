package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysRoleMenuConvert;
import com.taoyuan.system.dao.SysRoleMenuDao;
import com.taoyuan.system.entity.SysRoleMenuEntity;
import com.taoyuan.system.query.SysRoleMenuQuery;
import com.taoyuan.system.service.SysRoleMenuService;
import com.taoyuan.system.vo.SysRoleMenuVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色菜单关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

    @Override
    public PageResult<SysRoleMenuVO> page(SysRoleMenuQuery query) {
        IPage<SysRoleMenuEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysRoleMenuConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysRoleMenuEntity> getWrapper(SysRoleMenuQuery query) {
        LambdaQueryWrapper<SysRoleMenuEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysRoleMenuVO vo) {
        SysRoleMenuEntity entity = SysRoleMenuConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysRoleMenuVO vo) {
        SysRoleMenuEntity entity = SysRoleMenuConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}