package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysPostConvert;
import com.taoyuan.system.entity.SysPostEntity;
import com.taoyuan.system.query.SysPostQuery;
import com.taoyuan.system.service.SysPostService;
import com.taoyuan.system.vo.SysPostVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 岗位管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/post")
@Tag(name = "岗位管理")
@AllArgsConstructor
public class SysPostController {
    private final SysPostService sysPostService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysPostVO>> page(@ParameterObject @Valid SysPostQuery query) {
        PageResult<SysPostVO> page = sysPostService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysPostVO> get(@PathVariable("id") Long id) {
        SysPostEntity entity = sysPostService.getById(id);

        return Result.ok(SysPostConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysPostVO vo) {
        sysPostService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysPostVO vo) {
        sysPostService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysPostService.delete(idList);

        return Result.ok();
    }
}