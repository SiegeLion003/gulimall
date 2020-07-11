package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cuihp
 * @email 363656197@1qq.com
 * @date 2020-07-11 20:36:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
