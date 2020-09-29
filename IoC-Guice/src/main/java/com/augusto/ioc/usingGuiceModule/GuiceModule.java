package com.augusto.ioc.usingGuiceModule;

import com.augusto.ioc.usingGuiceModule.beans.Product;
import com.augusto.ioc.usingGuiceModule.beans.Store;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;

public class GuiceModule extends AbstractModule {

    // Creating a Provider with set
    @Provides
    public Product product() {
        Product product = new Product();
        product.setName("product");
        return product;
    }

    // Creating a provider with set using another provider
    @Provides
    public Store store(){
        Store store = new Store();
        store.setProduct(product());
        store.setDescription("Store");
        return store;
    }

}
