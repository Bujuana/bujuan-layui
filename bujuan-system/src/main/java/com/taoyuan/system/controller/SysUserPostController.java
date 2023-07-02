package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysUserPostConvert;
import com.taoyuan.system.entity.SysUserPostEntity;
import com.taoyuan.system.query.SysUserPostQuery;
import com.taoyuan.system.service.SysUserPostService;
import com.taoyuan.system.vo.SysUserPostVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/user_post")
@Tag(name = "用户岗位关系")
@AllArgsConstructor
public class SysUserPostController {
    private final SysUserPostService sysUserPostService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysUserPostVO>> page(@ParameterObject @Valid SysUserPostQuery query) {
        PageResult<SysUserPostVO> page = sysUserPostService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysUserPostVO> get(@PathVariable("id") Long id) {
        SysUserPostEntity entity = sysUserPostService.getById(id);

        return Result.ok(SysUserPostConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysUserPostVO vo) {
        sysUserPostService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysUserPostVO vo) {
        sysUserPostService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysUserPostService.delete(idList);

        return Result.ok();
    }
}