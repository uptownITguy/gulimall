package com.company.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.common.utils.PageUtils;
import com.company.gulimall.member.entity.UmsGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author uptownITguy
 * @email shishang1.0@fashion.com
 * @date 2021-08-15 22:46:32
 */
public interface UmsGrowthChangeHistoryService extends IService<UmsGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

