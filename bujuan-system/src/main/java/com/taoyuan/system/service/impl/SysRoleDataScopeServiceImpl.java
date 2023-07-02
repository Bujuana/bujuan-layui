package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysRoleDataScopeConvert;
import com.taoyuan.system.dao.SysRoleDataScopeDao;
import com.taoyuan.system.entity.SysRoleDataScopeEntity;
import com.taoyuan.system.query.SysRoleDataScopeQuery;
import com.taoyuan.system.service.SysRoleDataScopeService;
import com.taoyuan.system.vo.SysRoleDataScopeVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色数据权限
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysRoleDataScopeServiceImpl extends BaseServiceImpl<SysRoleDataScopeDao, SysRoleDataScopeEntity> implements SysRoleDataScopeService {

    @Override
    public PageResult<SysRoleDataScopeVO> page(SysRoleDataScopeQuery query) {
        IPage<SysRoleDataScopeEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysRoleDataScopeConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysRoleDataScopeEntity> getWrapper(SysRoleDataScopeQuery query) {
        LambdaQueryWrapper<SysRoleDataScopeEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysRoleDataScopeVO vo) {
        SysRoleDataScopeEntity entity = SysRoleDataScopeConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysRoleDataScopeVO vo) {
        SysRoleDataScopeEntity entity = SysRoleDataScopeConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}