package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysRoleMenuEntity;
import com.taoyuan.system.vo.SysRoleMenuVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 角色菜单关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysRoleMenuConvert {
    SysRoleMenuConvert INSTANCE = Mappers.getMapper(SysRoleMenuConvert.class);

    SysRoleMenuEntity convert(SysRoleMenuVO vo);

    SysRoleMenuVO convert(SysRoleMenuEntity entity);

    List<SysRoleMenuVO> convertList(List<SysRoleMenuEntity> list);

}