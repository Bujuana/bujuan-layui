package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysDictTypeConvert;
import com.taoyuan.system.entity.SysDictTypeEntity;
import com.taoyuan.system.query.SysDictTypeQuery;
import com.taoyuan.system.service.SysDictTypeService;
import com.taoyuan.system.vo.SysDictTypeVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 字典类型
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/type")
@Tag(name = "字典类型")
@AllArgsConstructor
public class SysDictTypeController {
    private final SysDictTypeService sysDictTypeService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysDictTypeVO>> page(@ParameterObject @Valid SysDictTypeQuery query) {
        PageResult<SysDictTypeVO> page = sysDictTypeService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysDictTypeVO> get(@PathVariable("id") Long id) {
        SysDictTypeEntity entity = sysDictTypeService.getById(id);

        return Result.ok(SysDictTypeConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysDictTypeVO vo) {
        sysDictTypeService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysDictTypeVO vo) {
        sysDictTypeService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysDictTypeService.delete(idList);

        return Result.ok();
    }
}