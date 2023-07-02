package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysUserRoleEntity;
import com.taoyuan.system.vo.SysUserRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户角色关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysUserRoleConvert {
    SysUserRoleConvert INSTANCE = Mappers.getMapper(SysUserRoleConvert.class);

    SysUserRoleEntity convert(SysUserRoleVO vo);

    SysUserRoleVO convert(SysUserRoleEntity entity);

    List<SysUserRoleVO> convertList(List<SysUserRoleEntity> list);

}