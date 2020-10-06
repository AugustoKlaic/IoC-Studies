package testWithoutFramework;

import testWithoutFramework.beans.ClothesStore;
import testWithoutFramework.beans.FoodStore;
import testWithoutFramework.beans.Store;

public class ApplicationMain {
    public static void main(String[] args) {

        Store store1 = new FoodStore();
        store1.sellProduct();

        Store store2 = new ClothesStore();
        store2.sellProduct();
    }
}
