package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysDictDataEntity;
import com.taoyuan.system.vo.SysDictDataVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 字典数据
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysDictDataConvert {
    SysDictDataConvert INSTANCE = Mappers.getMapper(SysDictDataConvert.class);

    SysDictDataEntity convert(SysDictDataVO vo);

    SysDictDataVO convert(SysDictDataEntity entity);

    List<SysDictDataVO> convertList(List<SysDictDataEntity> list);

}