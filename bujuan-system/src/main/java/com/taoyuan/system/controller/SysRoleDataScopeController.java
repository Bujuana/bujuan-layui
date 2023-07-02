package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysRoleDataScopeConvert;
import com.taoyuan.system.entity.SysRoleDataScopeEntity;
import com.taoyuan.system.query.SysRoleDataScopeQuery;
import com.taoyuan.system.service.SysRoleDataScopeService;
import com.taoyuan.system.vo.SysRoleDataScopeVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 角色数据权限
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/scope")
@Tag(name = "角色数据权限")
@AllArgsConstructor
public class SysRoleDataScopeController {
    private final SysRoleDataScopeService sysRoleDataScopeService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysRoleDataScopeVO>> page(@ParameterObject @Valid SysRoleDataScopeQuery query) {
        PageResult<SysRoleDataScopeVO> page = sysRoleDataScopeService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysRoleDataScopeVO> get(@PathVariable("id") Long id) {
        SysRoleDataScopeEntity entity = sysRoleDataScopeService.getById(id);

        return Result.ok(SysRoleDataScopeConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysRoleDataScopeVO vo) {
        sysRoleDataScopeService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysRoleDataScopeVO vo) {
        sysRoleDataScopeService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysRoleDataScopeService.delete(idList);

        return Result.ok();
    }
}