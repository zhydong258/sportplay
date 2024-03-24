package com.zhydong.sportplay.util;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// 全局配置类--配置跨域请求
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         *  1. 访问路径
         *  2. 请求来源
         *  3. 方法
         *  4. 允许携带
         *  5. 最大时间
         */
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
