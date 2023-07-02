package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.convert.SysAttachmentConvert;
import com.taoyuan.system.entity.SysAttachmentEntity;
import com.taoyuan.system.query.SysAttachmentQuery;
import com.taoyuan.system.service.SysAttachmentService;
import com.taoyuan.system.vo.SysAttachmentVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 附件管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@RestController
@RequestMapping("system/attachment")
@Tag(name = "附件管理")
@AllArgsConstructor
public class SysAttachmentController {
    private final SysAttachmentService sysAttachmentService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<SysAttachmentVO>> page(@ParameterObject @Valid SysAttachmentQuery query) {
        PageResult<SysAttachmentVO> page = sysAttachmentService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<SysAttachmentVO> get(@PathVariable("id") Long id) {
        SysAttachmentEntity entity = sysAttachmentService.getById(id);

        return Result.ok(SysAttachmentConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody SysAttachmentVO vo) {
        sysAttachmentService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid SysAttachmentVO vo) {
        sysAttachmentService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysAttachmentService.delete(idList);

        return Result.ok();
    }
}