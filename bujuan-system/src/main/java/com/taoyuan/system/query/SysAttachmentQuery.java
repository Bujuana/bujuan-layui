package com.taoyuan.system.query;

import com.taoyuan.framework.common.query.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 附件管理查询
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "附件管理查询")
public class SysAttachmentQuery extends Query {
}