package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-Puls
 * 1,导入依赖
 *     <dependency>
 *         <groupId>com.baomidou</groupId>
 *         <artifactId>mybatis-plus-boot-starter</artifactId>
 *         <version>${mybatis.version}</version>
 *     </dependency>
 * 2,配置
 * 		1,配置数据源
 * 			1)导入数据库驱动
 * 			2)在application.yml中配置数据源相关信息
 * 		2,配置mybatis-plus
 * 			1)使用mapperScan注解告诉mybatis接口在哪
 * 			2)告诉mybatis sql的映射文件在哪(Mapper.xml)
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
