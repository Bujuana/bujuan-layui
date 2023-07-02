package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysOrgConvert;
import com.taoyuan.system.entity.SysOrgEntity;
import com.taoyuan.system.query.SysOrgQuery;
import com.taoyuan.system.service.SysOrgService;
import com.taoyuan.system.vo.SysOrgVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 机构管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/org")
@Tag(name = "机构管理")
@AllArgsConstructor
public class SysOrgController {
    private final SysOrgService sysOrgService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysOrgVO>> page(@ParameterObject @Valid SysOrgQuery query) {
        PageResult<SysOrgVO> page = sysOrgService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysOrgVO> get(@PathVariable("id") Long id) {
        SysOrgEntity entity = sysOrgService.getById(id);

        return Result.ok(SysOrgConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysOrgVO vo) {
        sysOrgService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysOrgVO vo) {
        sysOrgService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysOrgService.delete(idList);

        return Result.ok();
    }
}