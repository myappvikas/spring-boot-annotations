package com.spring.boot.annotations.config;

import com.spring.boot.annotations.beans.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DemoBean demoBean(){
        return new DemoBean();
    }
}
