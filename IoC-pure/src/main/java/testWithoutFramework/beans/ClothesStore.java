package testWithoutFramework.beans;

public class ClothesStore implements Store{
    private String name;

    public ClothesStore() {
    }

    @Override
    public void sellProduct(){
        System.out.println("Clothes sold");
    }
}
