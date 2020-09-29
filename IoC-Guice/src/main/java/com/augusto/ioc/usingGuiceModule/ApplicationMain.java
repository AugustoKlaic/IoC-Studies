package com.augusto.ioc.usingGuiceModule;

import com.augusto.ioc.usingGuiceModule.beans.Product;
import com.augusto.ioc.usingGuiceModule.beans.Store;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationMain {

    public static void main(String[] args) {
        // Create injector passing config file to it
        Injector injector = Guice.createInjector(new GuiceModule());

        // Inject the class
        Product product = injector.getInstance(Product.class);
        System.out.println(product);

        // Creating store object using injection
        Store store = injector.getInstance(Store.class);
        System.out.println(store);
    }
}
