package testWithoutFramework.beans;

public class Store {

    private String description;
    private Product product;

    public Store(String description, Product product) {
        this.description = description;
        this.product = product;
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
}