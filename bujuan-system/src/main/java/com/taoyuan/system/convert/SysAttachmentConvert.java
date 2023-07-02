package com.taoyuan.system.convert;

import com.taoyuan.system.entity.SysAttachmentEntity;
import com.taoyuan.system.vo.SysAttachmentVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 附件管理
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@Mapper
public interface SysAttachmentConvert {
    SysAttachmentConvert INSTANCE = Mappers.getMapper(SysAttachmentConvert.class);

    SysAttachmentEntity convert(SysAttachmentVO vo);

    SysAttachmentVO convert(SysAttachmentEntity entity);

    List<SysAttachmentVO> convertList(List<SysAttachmentEntity> list);

}