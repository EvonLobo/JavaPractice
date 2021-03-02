package main;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int total() {
        int sum = 0;
        for (Product p : products) {
            sum = sum + p.getPrice();
        }
        return sum;
    }
}
