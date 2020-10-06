package testWithoutFramework.beans;

public class FoodStore implements Store {

    public FoodStore() {
    }

    @Override
    public void sellProduct(){
        System.out.println("Food sold");
    }
}