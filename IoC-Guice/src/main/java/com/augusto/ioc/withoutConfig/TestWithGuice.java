package com.augusto.ioc.withoutConfig;

import com.augusto.ioc.withoutConfig.beans.Product;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestWithGuice {

    public static void main(String[] args) {

        // Simple injection, without any configuration
        Injector injector = Guice.createInjector();
        Product product = injector.getInstance(Product.class);
        System.out.println(product);
    }
}
