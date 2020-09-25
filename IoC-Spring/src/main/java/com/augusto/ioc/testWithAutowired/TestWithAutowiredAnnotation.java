package com.augusto.ioc.testWithAutowired;

import com.augusto.ioc.testWithAutowired.beans.Store;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithAutowiredAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Store store = context.getBean(Store.class);
        System.out.println(store.getProduct());

    }
}
