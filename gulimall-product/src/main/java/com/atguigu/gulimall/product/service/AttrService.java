package com.atguigu.gulimall.product.service;

import java.util.Map;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品属性
 *
 * @author cuihp
 * @email 363656197@1qq.com
 * @date 2020-07-09 23:11:49
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

