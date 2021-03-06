package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cuihp
 * @email 363656197@1qq.com
 * @date 2020-07-11 20:29:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
