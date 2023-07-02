package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysDictTypeConvert;
import com.taoyuan.system.dao.SysDictTypeDao;
import com.taoyuan.system.entity.SysDictTypeEntity;
import com.taoyuan.system.query.SysDictTypeQuery;
import com.taoyuan.system.service.SysDictTypeService;
import com.taoyuan.system.vo.SysDictTypeVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 字典类型
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysDictTypeServiceImpl extends BaseServiceImpl<SysDictTypeDao, SysDictTypeEntity> implements SysDictTypeService {

    @Override
    public PageResult<SysDictTypeVO> page(SysDictTypeQuery query) {
        IPage<SysDictTypeEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysDictTypeConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysDictTypeEntity> getWrapper(SysDictTypeQuery query) {
        LambdaQueryWrapper<SysDictTypeEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysDictTypeVO vo) {
        SysDictTypeEntity entity = SysDictTypeConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysDictTypeVO vo) {
        SysDictTypeEntity entity = SysDictTypeConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}