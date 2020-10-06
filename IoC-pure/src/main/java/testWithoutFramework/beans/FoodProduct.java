package testWithoutFramework.beans;

public class FoodProduct implements Product {

    private String description = "food";

    @Override
    public String getDescription() {
        return this.description;
    }
}
