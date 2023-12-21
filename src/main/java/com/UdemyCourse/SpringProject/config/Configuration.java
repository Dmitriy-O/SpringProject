package com.UdemyCourse.SpringProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {
    @Bean
    public int intBean() {
        System.out.println("bean was called");
        return 10;
    }
}

