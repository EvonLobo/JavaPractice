package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Shop shop1; //because I am inside public main method so "public" or "private" doesn't need to be mentioned.
        shop1 = new Shop();
        Food food1 = new Food("apple", 3); //Stocking the shelves
        Food food2 = new Food("bread", 4);
        Product app1 = new Appliance("Toaster", 20); //"Product" can be used instead of Appliance
        Product app2 = new Appliance("Microwave", 70);
        Product gar1 = new Garment("T-shirt", 9, "Large");
        Product gar2 = new Garment("Skirt", 11, "Small");
        shop1.displayProduct(food1); //displaying on shelves, adding products to 
        shop1.displayProduct(food2); //shopInventory ArrayList, we could create 
        shop1.displayProduct(app1);//shop2 and have a different list of Products 
        shop1.displayProduct(app2);//in an ArrayList
        shop1.displayProduct(gar1);
        shop1.displayProduct(gar2);
        
        // Then get a new basket, add some products to
        //it, and checkout.
        Basket basket1;
        basket1 = new Basket();
        basket1.addProduct(gar2);
        basket1.addProduct(app2);
        basket1.addProduct(food2);
        System.out.println(shop1.checkout(basket1)); 
        
        
        
        // Another method of doing the same thing as the for loop below
        // ArrayList<Product> shop1Stock = shop1.getAllProducts();
        // for (Product p : shop1Stock) {
        for (Product p : shop1.getAllProducts()) //In order to call a method of a class, we need an instance. our instance is shop1 of class Shop. 
        //so we can doshop1 and access any of the methods inside Shop.
        //We have to access the ArrayList through the method getAllProducts since the AL is private in Shop
        {
            System.out.println(p.toString());
        }
    }

}
