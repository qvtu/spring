//package com.rzhylj.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @copyright (C), 2019-2022, Kkoo
// * @author: kkoo
// * @date: 2022/4/6 7:20 PM
// * @fileName: MyMvcConfig
// */
//@Configuration
//public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","user/login","/css/**","/js/**","/img/**");
//    }
//}
