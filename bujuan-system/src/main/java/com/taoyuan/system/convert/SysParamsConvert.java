package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysParamsEntity;
import com.taoyuan.system.vo.SysParamsVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 参数管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysParamsConvert {
    SysParamsConvert INSTANCE = Mappers.getMapper(SysParamsConvert.class);

    SysParamsEntity convert(SysParamsVO vo);

    SysParamsVO convert(SysParamsEntity entity);

    List<SysParamsVO> convertList(List<SysParamsEntity> list);

}