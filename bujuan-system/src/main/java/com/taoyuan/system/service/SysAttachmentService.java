package com.taoyuan.system.service;

import com.taoyuan.framework.common.resp.PageResult;
import com.taoyuan.framework.mybatis.service.BaseService;
import com.taoyuan.system.entity.SysAttachmentEntity;
import com.taoyuan.system.query.SysAttachmentQuery;
import com.taoyuan.system.vo.SysAttachmentVO;

import java.util.List;

/**
 * 附件管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
public interface SysAttachmentService extends BaseService<SysAttachmentEntity> {

    PageResult<SysAttachmentVO> page(SysAttachmentQuery query);

    void save(SysAttachmentVO vo);

    void update(SysAttachmentVO vo);

    void delete(List<Long> idList);
}