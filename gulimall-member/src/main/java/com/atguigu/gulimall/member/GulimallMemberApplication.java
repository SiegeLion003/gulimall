package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要调用远程服务
 * 1)引入openFeign pom
 * 2)编写一个接口告诉springCloud这个接口需要调用远程服务
 * 3)声明接口的每一个方法都是调用的哪个服务的哪个方法
 * 4)开启远程服务
 */
/*
//feign接口上添加了@Component 注解  所以@EnaableFeignClients注解中不用添加basePackages属性
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
*/
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
