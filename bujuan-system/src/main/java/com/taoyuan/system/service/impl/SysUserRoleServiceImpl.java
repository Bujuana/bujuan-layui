package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysUserRoleConvert;
import com.taoyuan.system.dao.SysUserRoleDao;
import com.taoyuan.system.entity.SysUserRoleEntity;
import com.taoyuan.system.query.SysUserRoleQuery;
import com.taoyuan.system.service.SysUserRoleService;
import com.taoyuan.system.vo.SysUserRoleVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户角色关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

    @Override
    public PageResult<SysUserRoleVO> page(SysUserRoleQuery query) {
        IPage<SysUserRoleEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysUserRoleConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysUserRoleEntity> getWrapper(SysUserRoleQuery query) {
        LambdaQueryWrapper<SysUserRoleEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysUserRoleVO vo) {
        SysUserRoleEntity entity = SysUserRoleConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysUserRoleVO vo) {
        SysUserRoleEntity entity = SysUserRoleConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}