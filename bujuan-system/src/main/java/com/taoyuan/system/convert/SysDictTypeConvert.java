package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysDictTypeEntity;
import com.taoyuan.system.vo.SysDictTypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 字典类型
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysDictTypeConvert {
    SysDictTypeConvert INSTANCE = Mappers.getMapper(SysDictTypeConvert.class);

    SysDictTypeEntity convert(SysDictTypeVO vo);

    SysDictTypeVO convert(SysDictTypeEntity entity);

    List<SysDictTypeVO> convertList(List<SysDictTypeEntity> list);

}