package com.atguigu.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.common.utils.R;

/**
 * Description:
 * FileName: CouponFeignService
 * Author: cuihp
 * Date: 2020/7/19
 */
@Component
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping( "coupon/coupon/member/list")
    public R membercoupons();
}
