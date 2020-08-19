package com.edu.linkconvert.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName ApplicationConfig
 * @Author 赵九州
 * @Date 2020/8/19 9:29
 * @Description TODO
 */
@SpringBootConfiguration
@ComponentScan({"com.edu.linkconvert"})
@MapperScan({"com.edu.linkconvert.mapper"})
public class ApplicationConfig {
}
