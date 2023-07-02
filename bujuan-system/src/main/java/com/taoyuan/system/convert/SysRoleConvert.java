package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysRoleEntity;
import com.taoyuan.system.vo.SysRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 角色管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysRoleConvert {
    SysRoleConvert INSTANCE = Mappers.getMapper(SysRoleConvert.class);

    SysRoleEntity convert(SysRoleVO vo);

    SysRoleVO convert(SysRoleEntity entity);

    List<SysRoleVO> convertList(List<SysRoleEntity> list);

}