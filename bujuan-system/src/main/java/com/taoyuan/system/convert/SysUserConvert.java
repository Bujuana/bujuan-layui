package com.taoyuan.system.convert;


import com.taoyuan.system.entity.SysUserEntity;
import com.taoyuan.system.vo.SysUserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-27
 */
@Mapper
public interface SysUserConvert {
    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    SysUserEntity convert(SysUserVO vo);

    SysUserVO convert(SysUserEntity entity);

    List<SysUserVO> convertList(List<SysUserEntity> list);

}