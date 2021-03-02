package main;

public class Appliance extends Product {

    private int powerRating;

    public Appliance(String name, int price) {
        super(name, price);
    }

    public Appliance(String name, int price, int powerRating) {
        this.name = name;
        this.price = price;
        this.powerRating = powerRating;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int newPowerRating) {
        this.powerRating = newPowerRating;
    }

    @Override
    public String toString() {
        return this.getName() + "," + this.getPrice() + "," + this.powerRating;
    }
}
