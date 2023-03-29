package com.zhifou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.zhifou")
@MapperScan(basePackages = {"com.zhifou.mapper"})
public class MapperConfig {
}
