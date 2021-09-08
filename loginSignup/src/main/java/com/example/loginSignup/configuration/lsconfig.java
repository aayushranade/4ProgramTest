package com.example.loginSignup.configuration;

import com.example.loginSignup.model.lsmodel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class lsconfig {
    @Bean
    public lsmodel lsmodelobj() {
        return new lsmodel();
    }
}
