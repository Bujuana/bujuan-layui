package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysLogOperateConvert;
import com.taoyuan.system.entity.SysLogOperateEntity;
import com.taoyuan.system.query.SysLogOperateQuery;
import com.taoyuan.system.service.SysLogOperateService;
import com.taoyuan.system.vo.SysLogOperateVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 操作日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/operate")
@Tag(name = "操作日志")
@AllArgsConstructor
public class SysLogOperateController {
    private final SysLogOperateService sysLogOperateService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysLogOperateVO>> page(@ParameterObject @Valid SysLogOperateQuery query) {
        PageResult<SysLogOperateVO> page = sysLogOperateService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysLogOperateVO> get(@PathVariable("id") Long id) {
        SysLogOperateEntity entity = sysLogOperateService.getById(id);

        return Result.ok(SysLogOperateConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysLogOperateVO vo) {
        sysLogOperateService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysLogOperateVO vo) {
        sysLogOperateService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysLogOperateService.delete(idList);

        return Result.ok();
    }
}