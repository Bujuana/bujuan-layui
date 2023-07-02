package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysRoleDataScopeEntity;
import com.taoyuan.system.vo.SysRoleDataScopeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 角色数据权限
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysRoleDataScopeConvert {
    SysRoleDataScopeConvert INSTANCE = Mappers.getMapper(SysRoleDataScopeConvert.class);

    SysRoleDataScopeEntity convert(SysRoleDataScopeVO vo);

    SysRoleDataScopeVO convert(SysRoleDataScopeEntity entity);

    List<SysRoleDataScopeVO> convertList(List<SysRoleDataScopeEntity> list);

}