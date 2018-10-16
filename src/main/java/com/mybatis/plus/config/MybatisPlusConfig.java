package com.mybatis.plus.config;

import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author huran
 * @Title: MybatisPlusConfig
 * @ProjectName mybatis-plus
 * @Description: TODO
 * @date 2018/10/1514:53
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.mybatis.plus.mapper")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    /**
     * sequence主键，需要配置一个主键生成器
     * @return
     */
    @Bean
    public H2KeyGenerator h2KeyGenerator(){
        return new H2KeyGenerator();
    }
}
