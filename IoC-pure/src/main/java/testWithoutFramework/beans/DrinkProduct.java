package testWithoutFramework.beans;

public class DrinkProduct implements Product {

    private String description = "drink";

    @Override
    public String getDescription() {
        return this.description;
    }
}
