package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysUserConvert;
import com.taoyuan.system.entity.SysUserEntity;
import com.taoyuan.system.query.SysUserQuery;
import com.taoyuan.system.service.SysUserService;
import com.taoyuan.system.vo.SysUserVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-27
 */
@RestController
@RequestMapping("bujuan-system/user")
@Tag(name = "用户管理")
@AllArgsConstructor
public class SysUserController {
    private final SysUserService sysUserService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysUserVO>> page(@ParameterObject @Valid SysUserQuery query) {
        PageResult<SysUserVO> page = sysUserService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysUserVO> get(@PathVariable("id") Long id) {
        SysUserEntity entity = sysUserService.getById(id);

        return Result.ok(SysUserConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysUserVO vo) {
        sysUserService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysUserVO vo) {
        sysUserService.update(vo);
        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysUserService.delete(idList);

        return Result.ok();
    }
}