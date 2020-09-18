package com.augusto.ioc;

import com.augusto.ioc.beans.Store;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Store storeWithParametrizedConstructor = context.getBean("storeWithParametrizedConstructor", Store.class);
        System.out.println(storeWithParametrizedConstructor);

        Store storeWithSetterUsingAnotherBean = context.getBean("storeWithSetterUsingAnotherBean", Store.class);
        System.out.println(storeWithSetterUsingAnotherBean);
    }
}
