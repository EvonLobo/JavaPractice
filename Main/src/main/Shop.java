package main;

import java.util.ArrayList;

public class Shop {

    public String basket;
    private ArrayList<Product> shopInventory; //mentioned in question 1, shopInventory is everything on the shelves

    public Shop() {
        this.shopInventory = new ArrayList<>();
//Building the shelves, otherwise it would give an error saying we are trying 
//to put it in an ArrayList that doesn't exist yet.
    }

    public ArrayList<Product> getAllProducts() { //Everything that is available to buy
        return shopInventory;
    }

    public void displayProduct(Product product) {
        shopInventory.add(product); //Stocking the store with products
    }

    public int checkout(Basket basket) {
        return basket.total();
    }

}
