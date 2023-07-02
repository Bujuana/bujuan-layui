package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysDictDataConvert;
import com.taoyuan.system.entity.SysDictDataEntity;
import com.taoyuan.system.query.SysDictDataQuery;
import com.taoyuan.system.service.SysDictDataService;
import com.taoyuan.system.vo.SysDictDataVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 字典数据
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/data")
@Tag(name = "字典数据")
@AllArgsConstructor
public class SysDictDataController {
    private final SysDictDataService sysDictDataService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysDictDataVO>> page(@ParameterObject @Valid SysDictDataQuery query) {
        PageResult<SysDictDataVO> page = sysDictDataService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysDictDataVO> get(@PathVariable("id") Long id) {
        SysDictDataEntity entity = sysDictDataService.getById(id);

        return Result.ok(SysDictDataConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysDictDataVO vo) {
        sysDictDataService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysDictDataVO vo) {
        sysDictDataService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysDictDataService.delete(idList);

        return Result.ok();
    }
}