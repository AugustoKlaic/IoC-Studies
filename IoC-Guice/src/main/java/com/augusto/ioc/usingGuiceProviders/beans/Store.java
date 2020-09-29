package com.augusto.ioc.usingGuiceProviders.beans;

import com.google.inject.Inject;

public class Store {

    private String description;

    private Product product;

    public Store(String description, Product product) {
        this();
        this.description = description;
        this.product = product;
    }

    public Store() {
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
