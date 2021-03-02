package main;

public abstract class Product {

    protected String name;
    protected int price;

    public Product() {

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public String toString() {
        return this.getName() + "," + this.getPrice();
    }

}
