package com.company.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.common.utils.PageUtils;
import com.company.gulimall.member.entity.UmsMemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author uptownITguy
 * @email shishang1.0@fashion.com
 * @date 2021-08-15 22:46:32
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

