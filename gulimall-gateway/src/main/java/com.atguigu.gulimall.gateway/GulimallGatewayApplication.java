package com.atguigu.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: 网关启动类
 * FileName: GulimallGatewayApplication
 * Author: cuihp
 * Date: 2020/7/20
 */

/**
 * 1,网关开启服务的注册发现   @EnableDiscoveryClient
 * 2,配置nacaos注册中心地址
 */
@EnableDiscoveryClient
// exclude 排除跟数据库有关的配置(即不加载数据库等配置信息)  排除依赖为什么不生效?
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
/*不知道为什么@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) 不起作用
 *
 * 如果有哪位大神知道是什么原因  跪求指点
 *
 * 所以把该module的druid mysql驱动注释掉,排除common的 mybatis-plus
 */
@SpringBootApplication
public class GulimallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApplication.class, args);
    }

}
