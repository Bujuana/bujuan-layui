package com.taoyuan.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taoyuan.framework.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户岗位关系
 *
 * @author bujuan
 * @since 1.0.0 2023-06-28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("sys_user_post")
public class SysUserPostEntity extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 岗位ID
     */
    private Long postId;


}