package com.augusto.ioc;

import com.augusto.ioc.beans.Product;
import com.augusto.ioc.beans.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Here is default a notation based Spring bean
    @Bean(name = "storeWithParametrizedConstructor")
    public Store storeWithParametrizedConstructor() {
        return new Store("Description", productWithDefaultConstructor());
    }

    // Here is a setter-based bean using another setter-based bean
    @Bean(name = "storeWithSetterUsingAnotherBean")
    public Store storeWithSetterUsingAnotherBean() {
        Store store = new Store();
        store.setDescription("Description");
        store.setProduct(productWithSetter());
        return store;
    }

    // Here is a bean with a given name and default constructor
    @Bean(name = "productWithDefaultConstructor")
    public Product productWithDefaultConstructor() {
        return new Product();
    }

    // Here is a bean with setter-based dependency injection
    @Bean(name = "productWithSetter")
    public Product productWithSetter() {
        Product product = new Product();
        product.setName("Name");
        return product;
    }
}
