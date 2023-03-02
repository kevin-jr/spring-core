package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Component;

@PropertySource("classpath:/application.properties")
@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public ConversionService conversionService(){
        return new DefaultConversionService();
    }
}
