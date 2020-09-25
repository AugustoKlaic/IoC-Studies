package com.augusto.ioc.testWithAutowired;

import com.augusto.ioc.testWithAutowired.beans.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.augusto.ioc.testWithAutowired.beans")
public class AppConfig {

    @Bean
    public Store store() {
        return new Store();
    }

}
