package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysRoleMenuConvert;
import com.taoyuan.system.entity.SysRoleMenuEntity;
import com.taoyuan.system.query.SysRoleMenuQuery;
import com.taoyuan.system.service.SysRoleMenuService;
import com.taoyuan.system.vo.SysRoleMenuVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 角色菜单关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/role_menu")
@Tag(name = "角色菜单关系")
@AllArgsConstructor
public class SysRoleMenuController {
    private final SysRoleMenuService sysRoleMenuService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysRoleMenuVO>> page(@ParameterObject @Valid SysRoleMenuQuery query) {
        PageResult<SysRoleMenuVO> page = sysRoleMenuService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysRoleMenuVO> get(@PathVariable("id") Long id) {
        SysRoleMenuEntity entity = sysRoleMenuService.getById(id);

        return Result.ok(SysRoleMenuConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysRoleMenuVO vo) {
        sysRoleMenuService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysRoleMenuVO vo) {
        sysRoleMenuService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysRoleMenuService.delete(idList);

        return Result.ok();
    }
}