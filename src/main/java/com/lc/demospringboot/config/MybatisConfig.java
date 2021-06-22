package com.lc.demospringboot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: lichao
 * @Date: 2021/5/8 10:07
 * @Descr: $
 */
@Configuration
//扫描mapper接口
public class MybatisConfig {
    @Bean
    public TestBean testBean(){
        return new TestBean();
    }
}
