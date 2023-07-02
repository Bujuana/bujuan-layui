package com.taoyuan.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.impl.BaseServiceImpl;
import com.taoyuan.system.convert.SysLogOperateConvert;
import com.taoyuan.system.dao.SysLogOperateDao;
import com.taoyuan.system.entity.SysLogOperateEntity;
import com.taoyuan.system.query.SysLogOperateQuery;
import com.taoyuan.system.service.SysLogOperateService;
import com.taoyuan.system.vo.SysLogOperateVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 操作日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Service
@AllArgsConstructor
public class SysLogOperateServiceImpl extends BaseServiceImpl<SysLogOperateDao, SysLogOperateEntity> implements SysLogOperateService {

    @Override
    public PageResult<SysLogOperateVO> page(SysLogOperateQuery query) {
        IPage<SysLogOperateEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysLogOperateConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SysLogOperateEntity> getWrapper(SysLogOperateQuery query) {
        LambdaQueryWrapper<SysLogOperateEntity> wrapper = Wrappers.lambdaQuery();
        return wrapper;
    }

    @Override
    public void save(SysLogOperateVO vo) {
        SysLogOperateEntity entity = SysLogOperateConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(SysLogOperateVO vo) {
        SysLogOperateEntity entity = SysLogOperateConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}