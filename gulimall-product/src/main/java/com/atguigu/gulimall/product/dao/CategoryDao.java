package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cuihp
 * @email 363656197@1qq.com
 * @date 2020-07-09 23:40:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
