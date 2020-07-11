package com.atguigu.gulimall.product.service;

import java.util.Map;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品评价
 *
 * @author cuihp
 * @email 363656197@1qq.com
 * @date 2020-07-09 23:11:49
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

