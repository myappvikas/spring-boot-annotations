package com.spring.boot.annotations.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DBConfig {

    @Value("${datasource.driver.class}")
    private String driverClassName;

    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.username}")
    private String userName;

    @Value("${datasource.password}")
    private String password;

    @Bean
    @Profile("prod")
    public String datasource(){
        System.out.println("Datasource properties: "+driverClassName+" "+url+" "+userName+" "+password);
        return "Datasource object created";
    }

}
