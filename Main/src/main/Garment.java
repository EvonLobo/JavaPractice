package main;

public class Garment extends Product {

    private String size;

    public Garment(String name, int price) {
        super(name, price);
    }

    public Garment(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    @Override
    public String toString() {
        return this.getName() + "," + this.getPrice() + "," + this.getSize();
    }
}
