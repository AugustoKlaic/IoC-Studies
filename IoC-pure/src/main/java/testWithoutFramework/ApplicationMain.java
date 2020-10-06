package testWithoutFramework;


import testWithoutFramework.beans.DrinkProduct;
import testWithoutFramework.beans.FoodProduct;
import testWithoutFramework.beans.Store;

public class ApplicationMain {
    public static void main(String[] args) {

        // With this implementation we can have more than 1 type of product for a store

        Store store1 = new Store("Food store", new FoodProduct());
        System.out.println(store1.getProduct().getDescription());
        Store store2 = new Store("Drink store", new DrinkProduct());
        System.out.println(store2.getProduct().getDescription());

    }
}
