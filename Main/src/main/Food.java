package main;

public class Food extends Product {

    private String expDate;

    public Food(String name, int price) {
        super(name, price);
    }

    public Food(String name, int price, String expDate) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String newExpDate) {
        this.expDate = newExpDate;
    }

    @Override
    public String toString() {
        return this.getName() + "," + this.getPrice() + "," + this.getExpDate();
    }
}
