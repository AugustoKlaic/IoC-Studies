package testWithCDI.beans;

import javax.inject.Inject;

public class Store {

    private String description;
    @Inject
    private Product product;

//    public Store(String description, Product product) {
//        this.description = description;
//        this.product = product;
//    }
//
//    public Store() {
//    }

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
