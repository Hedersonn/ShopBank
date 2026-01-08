package br.com.hederson.shopbank.app;


public class Item implements Comparable<Item> {
    private String name;
    private double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "$" + this.getPrice() + " | " + this.getName();
    }

    @Override
    public int compareTo(Item otherItem) {
        return Double.valueOf(this.getPrice()).compareTo(Double.valueOf(otherItem.getPrice()));
    }
}
