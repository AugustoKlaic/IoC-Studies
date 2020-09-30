package com.augusto.ioc.usingBind.beans;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Store2 {

    private String description;
    @Inject
    @Named("productField")
    private Product product;


    public Store2(String description, Product product) {
        this();
        this.description = description;
        this.product = product;
    }

    public Store2() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Store{" +
                "description='" + description + '\'' +
                ", product=" + product +
                '}';
    }

}
