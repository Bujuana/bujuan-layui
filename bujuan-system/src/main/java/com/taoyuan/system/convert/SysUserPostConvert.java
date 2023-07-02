package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysUserPostEntity;
import com.taoyuan.system.vo.SysUserPostVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysUserPostConvert {
    SysUserPostConvert INSTANCE = Mappers.getMapper(SysUserPostConvert.class);

    SysUserPostEntity convert(SysUserPostVO vo);

    SysUserPostVO convert(SysUserPostEntity entity);

    List<SysUserPostVO> convertList(List<SysUserPostEntity> list);

}