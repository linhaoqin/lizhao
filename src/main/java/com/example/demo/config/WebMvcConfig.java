package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc この表記はspring boot2以降では不要 などが読みこめなくなる
//This annotation is not needed in spring boot2
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

}