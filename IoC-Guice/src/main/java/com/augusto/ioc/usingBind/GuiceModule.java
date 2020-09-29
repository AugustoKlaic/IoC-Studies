package com.augusto.ioc.usingBind;

import com.augusto.ioc.usingBind.beans.Product;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

    public void configure() {
        bind(Product.class).annotatedWith(Names.named("product")).toInstance(new Product("product"));
    }
}
