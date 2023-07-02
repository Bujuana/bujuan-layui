package com.taoyuan.system.dao;

import com.taoyuan.framework.mybatis.dao.BaseDao;
import com.taoyuan.system.entity.SysAttachmentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 附件管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysAttachmentDao extends BaseDao<SysAttachmentEntity> {

}