package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysLogLoginConvert;
import com.taoyuan.system.entity.SysLogLoginEntity;
import com.taoyuan.system.query.SysLogLoginQuery;
import com.taoyuan.system.service.SysLogLoginService;
import com.taoyuan.system.vo.SysLogLoginVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 登录日志
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/login")
@Tag(name = "登录日志")
@AllArgsConstructor
public class SysLogLoginController {
    private final SysLogLoginService sysLogLoginService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysLogLoginVO>> page(@ParameterObject @Valid SysLogLoginQuery query) {
        PageResult<SysLogLoginVO> page = sysLogLoginService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysLogLoginVO> get(@PathVariable("id") Long id) {
        SysLogLoginEntity entity = sysLogLoginService.getById(id);

        return Result.ok(SysLogLoginConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysLogLoginVO vo) {
        sysLogLoginService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysLogLoginVO vo) {
        sysLogLoginService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysLogLoginService.delete(idList);

        return Result.ok();
    }
}