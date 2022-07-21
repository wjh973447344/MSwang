package com.wjh.mswang.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**").allowedOriginPatterns("*").allowedOrigins("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(true).maxAge(3600).allowedHeaders("*");

    }
}
