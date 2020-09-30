package com.augusto.ioc.usingBind;

import com.augusto.ioc.usingBind.beans.Store;
import com.augusto.ioc.usingBind.beans.Store2;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationMain {
    public static void main(String[] args) {
        // Create injector passing config file to it
        Injector injector = Guice.createInjector(new GuiceModule());

        // Creating store object injecting constructor
        Store storeParameter = injector.getInstance(Store.class);
        System.out.println(storeParameter);

        // Creating store object injecting field
        Store2 storeConstructor = injector.getInstance(Store2.class);
        System.out.println(storeConstructor);
    }
}
