package com.yulj.cloud.oauth2.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname OAuth2ServerConfiguration
 * @Description <h1>WebMvc 配置</h1>
 * @Author yulj
 * @Date 2022/07/18 14:54
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login");
    }

}