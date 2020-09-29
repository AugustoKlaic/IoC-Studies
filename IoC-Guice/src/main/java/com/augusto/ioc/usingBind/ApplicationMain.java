package com.augusto.ioc.usingBind;

import com.augusto.ioc.usingBind.beans.Store;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationMain {
    public static void main(String[] args) {
        // Create injector passing config file to it
        Injector injector = Guice.createInjector(new GuiceModule());


        // Creating store object using bind on module
        Store store = injector.getInstance(Store.class);
        System.out.println(store);
    }
}
