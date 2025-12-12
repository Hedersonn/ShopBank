package br.com.hederson.shopbank.app;


public class Item{
    private String name;
    private long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "$" + this.getPrice() + " | " + this.getName();
    }
}
