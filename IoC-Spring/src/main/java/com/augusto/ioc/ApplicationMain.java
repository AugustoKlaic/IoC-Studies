package com.augusto.ioc;

import com.augusto.ioc.beans.Store;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Store bean = context.getBean(Store.class);
        System.out.println(bean.getDescription());
    }
}
