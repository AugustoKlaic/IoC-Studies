package com.augusto.ioc;

import com.augusto.ioc.beans.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Store store(){
        return new Store("test");
    }
}
