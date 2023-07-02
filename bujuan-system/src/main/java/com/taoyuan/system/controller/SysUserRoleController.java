package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysUserRoleConvert;
import com.taoyuan.system.entity.SysUserRoleEntity;
import com.taoyuan.system.query.SysUserRoleQuery;
import com.taoyuan.system.service.SysUserRoleService;
import com.taoyuan.system.vo.SysUserRoleVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户角色关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/user_role")
@Tag(name = "用户角色关系")
@AllArgsConstructor
public class SysUserRoleController {
    private final SysUserRoleService sysUserRoleService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysUserRoleVO>> page(@ParameterObject @Valid SysUserRoleQuery query) {
        PageResult<SysUserRoleVO> page = sysUserRoleService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysUserRoleVO> get(@PathVariable("id") Long id) {
        SysUserRoleEntity entity = sysUserRoleService.getById(id);

        return Result.ok(SysUserRoleConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysUserRoleVO vo) {
        sysUserRoleService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysUserRoleVO vo) {
        sysUserRoleService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysUserRoleService.delete(idList);

        return Result.ok();
    }
}