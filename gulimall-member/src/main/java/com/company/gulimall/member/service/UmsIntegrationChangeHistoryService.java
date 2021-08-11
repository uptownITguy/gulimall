package com.company.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.common.utils.PageUtils;
import com.company.gulimall.member.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author uptownITguy
 * @email shishang1.0@fashion.com
 * @date 2021-08-15 22:46:32
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

