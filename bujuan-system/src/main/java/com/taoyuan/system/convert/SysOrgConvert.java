package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysOrgEntity;
import com.taoyuan.system.vo.SysOrgVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 机构管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysOrgConvert {
    SysOrgConvert INSTANCE = Mappers.getMapper(SysOrgConvert.class);

    SysOrgEntity convert(SysOrgVO vo);

    SysOrgVO convert(SysOrgEntity entity);

    List<SysOrgVO> convertList(List<SysOrgEntity> list);

}