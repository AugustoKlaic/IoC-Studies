package testWithCDI;

import testWithCDI.beans.Store;

public class TestWithGuice {

    public static void main(String[] args) {

        Store store = new Store();
        System.out.println(store);
    }
}
