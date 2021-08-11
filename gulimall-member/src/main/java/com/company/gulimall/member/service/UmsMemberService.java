package com.company.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.common.utils.PageUtils;
import com.company.gulimall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author uptownITguy
 * @email shishang1.0@fashion.com
 * @date 2021-08-15 22:46:32
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

