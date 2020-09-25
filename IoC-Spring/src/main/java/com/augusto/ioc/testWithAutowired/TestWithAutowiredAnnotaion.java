package com.augusto.ioc.testWithAutowired;

import com.augusto.ioc.testWithBean.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestWithAutowiredAnnotaion {

    @Autowired
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static void main(String[] args) {
        TestWithAutowiredAnnotaion testWithAutowiredAnnotaion = new TestWithAutowiredAnnotaion();

        System.out.println(testWithAutowiredAnnotaion.getProduct());
    }
}
