package com.fileservice.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : siddhant.sachdeva
 * @Created : 13-09-2022
 **/
@Configuration
public class GlobalCrossConfig {

    @Bean
    public WebMvcConfigurer crossConfig(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowCredentials(true)
                        .allowedHeaders("*").allowedMethods("*").allowedOriginPatterns("*");
            }
        };
    }

}
