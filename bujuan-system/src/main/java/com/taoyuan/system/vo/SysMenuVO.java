package com.taoyuan.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taoyuan.framework.common.utils.DateUtils;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Data
@Schema(description = "菜单管理")
public class SysMenuVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    private Long id;

    @Schema(description = "上级ID，一级菜单为0")
    private Long pid;

    @Schema(description = "菜单名称")
    private String name;

    @Schema(description = "菜单URL")
    private String url;

    @Schema(description = "授权标识(多个用逗号分隔，如：sys:menu:list,sys:menu:save)")
    private String authority;

    @Schema(description = "类型   0：菜单   1：按钮   2：接口")
    private Integer type;

    @Schema(description = "打开方式   0：内部   1：外部")
    private Integer openStyle;

    @Schema(description = "菜单图标")
    private String icon;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "版本号")
    private Integer version;

    @Schema(description = "删除标识  0：正常   1：已删除")
    private Integer deleted;

    @Schema(description = "创建者")
    private Long creator;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date createTime;

    @Schema(description = "更新者")
    private Long updater;

    @Schema(description = "更新时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date updateTime;


}