package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysPostEntity;
import com.taoyuan.system.vo.SysPostVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 岗位管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysPostConvert {
    SysPostConvert INSTANCE = Mappers.getMapper(SysPostConvert.class);

    SysPostEntity convert(SysPostVO vo);

    SysPostVO convert(SysPostEntity entity);

    List<SysPostVO> convertList(List<SysPostEntity> list);

}